#!/usr/bin/env bash

checkpoint() {
  local prompt=$1

  read -p "${prompt} [y|n] " -n 1 -r < /dev/tty
  echo
  if echo "$REPLY" | grep -v -E '^[Yy]$' > /dev/null; then
      echo "Aborting"
      exit 1
  fi
}

set -e

read -p 'CDP API version number: ' -r ver

checkpoint "Version ${ver}: correct?"

set -x
git tag -a -m "Tag for ${ver} Java SDK" "cdp-sdk-java-${ver}"
set +x

checkpoint "Push tag cdp-sdk-java-${ver}?"

set -x
git push origin "cdp-sdk-java-${ver}"
git switch cdp-sdk-java-external-release
git reset --hard "cdp-sdk-java-${ver}"
set +x

checkpoint "Push branch cdp-sdk-java-external-release?"

set -x
git push origin
git switch cdp-sdk-java-internal-release
git reset --hard "cdp-sdk-java-${ver}"
set +x

checkpoint "Push branch cdp-sdk-java-internal-release?"

set -x
git push origin
set +x

echo "Release done. Jobs to watch:"
echo "  https://build.service-delivery.cloudera.com/view/CDPCP/job/cdpcp-external-sdk-java-release-build/"
echo "  https://build.service-delivery.cloudera.com/view/CDPCP/job/cdpcp-internal-sdk-java-release-build/"
echo "  https://build.service-delivery.cloudera.com/view/CDPCP/job/cdpcp-publish-cdp-sdk-java-to-github/"
echo
echo "Verify results:"
echo "  http://maven.jenkins.cloudera.com:8081/artifactory/cdh-staging-local/com/cloudera/cdp/cdp-sdk-java/"
echo "  http://maven.jenkins.cloudera.com:8081/artifactory/libs-release-local/com/cloudera/cdp/cdp-sdk-java/"
echo "  https://github.com/cloudera/cdp-sdk-java"
