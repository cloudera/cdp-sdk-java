/*
 * Copyright (c) 2018 Cloudera, Inc. All Rights Reserved.
 *
 * Portions Copyright (c) Copyright 2013-2018 Amazon.com, Inc. or its
 * affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloudera.cdp.datalake.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.datalake.model.BackupRestoreOperationStatus;

/**
 * The state of each Solr backup/restore operation.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2024-08-02T09:36:49.744-07:00")
public class SolrBackupRestoreState  {

  /**
   * The status of the EDGE_INDEX_COLLECTION backup/restore.
   **/
  private BackupRestoreOperationStatus edgeIndexCollection = null;

  /**
   * The status of the FULLTEXT_INDEX_COLLECTION backup/restore.
   **/
  private BackupRestoreOperationStatus fulltextIndexCollection = null;

  /**
   * The status of the RANGER_AUDITS_COLLECTION backup/restore.
   **/
  private BackupRestoreOperationStatus rangerAuditsCollection = null;

  /**
   * The status of the VERTEX_INDEX_COLLECTION backup/restore.
   **/
  private BackupRestoreOperationStatus vertexIndexCollection = null;

  /**
   * The status of the EDGE_INDEX_COLLECTION deletion, which is done before a restore.
   **/
  private BackupRestoreOperationStatus edgeIndexCollectionDelete = null;

  /**
   * The status of the FULLTEXT_INDEX_COLLECTION deletion, which is done before a restore.
   **/
  private BackupRestoreOperationStatus fulltextIndexCollectionDelete = null;

  /**
   * The status of the RANGER_AUDITS_COLLECTION deletion, which is done before a restore.
   **/
  private BackupRestoreOperationStatus rangerAuditsCollectionDelete = null;

  /**
   * The status of the VERTEX_INDEX_COLLECTION deletion, which is done before a restore.
   **/
  private BackupRestoreOperationStatus vertexIndexCollectionDelete = null;

  /**
   * Getter for edgeIndexCollection.
   * The status of the EDGE_INDEX_COLLECTION backup/restore.
   **/
  @JsonProperty("edgeIndexCollection")
  public BackupRestoreOperationStatus getEdgeIndexCollection() {
    return edgeIndexCollection;
  }

  /**
   * Setter for edgeIndexCollection.
   * The status of the EDGE_INDEX_COLLECTION backup/restore.
   **/
  public void setEdgeIndexCollection(BackupRestoreOperationStatus edgeIndexCollection) {
    this.edgeIndexCollection = edgeIndexCollection;
  }

  /**
   * Getter for fulltextIndexCollection.
   * The status of the FULLTEXT_INDEX_COLLECTION backup/restore.
   **/
  @JsonProperty("fulltextIndexCollection")
  public BackupRestoreOperationStatus getFulltextIndexCollection() {
    return fulltextIndexCollection;
  }

  /**
   * Setter for fulltextIndexCollection.
   * The status of the FULLTEXT_INDEX_COLLECTION backup/restore.
   **/
  public void setFulltextIndexCollection(BackupRestoreOperationStatus fulltextIndexCollection) {
    this.fulltextIndexCollection = fulltextIndexCollection;
  }

  /**
   * Getter for rangerAuditsCollection.
   * The status of the RANGER_AUDITS_COLLECTION backup/restore.
   **/
  @JsonProperty("rangerAuditsCollection")
  public BackupRestoreOperationStatus getRangerAuditsCollection() {
    return rangerAuditsCollection;
  }

  /**
   * Setter for rangerAuditsCollection.
   * The status of the RANGER_AUDITS_COLLECTION backup/restore.
   **/
  public void setRangerAuditsCollection(BackupRestoreOperationStatus rangerAuditsCollection) {
    this.rangerAuditsCollection = rangerAuditsCollection;
  }

  /**
   * Getter for vertexIndexCollection.
   * The status of the VERTEX_INDEX_COLLECTION backup/restore.
   **/
  @JsonProperty("vertexIndexCollection")
  public BackupRestoreOperationStatus getVertexIndexCollection() {
    return vertexIndexCollection;
  }

  /**
   * Setter for vertexIndexCollection.
   * The status of the VERTEX_INDEX_COLLECTION backup/restore.
   **/
  public void setVertexIndexCollection(BackupRestoreOperationStatus vertexIndexCollection) {
    this.vertexIndexCollection = vertexIndexCollection;
  }

  /**
   * Getter for edgeIndexCollectionDelete.
   * The status of the EDGE_INDEX_COLLECTION deletion, which is done before a restore.
   **/
  @JsonProperty("edgeIndexCollectionDelete")
  public BackupRestoreOperationStatus getEdgeIndexCollectionDelete() {
    return edgeIndexCollectionDelete;
  }

  /**
   * Setter for edgeIndexCollectionDelete.
   * The status of the EDGE_INDEX_COLLECTION deletion, which is done before a restore.
   **/
  public void setEdgeIndexCollectionDelete(BackupRestoreOperationStatus edgeIndexCollectionDelete) {
    this.edgeIndexCollectionDelete = edgeIndexCollectionDelete;
  }

  /**
   * Getter for fulltextIndexCollectionDelete.
   * The status of the FULLTEXT_INDEX_COLLECTION deletion, which is done before a restore.
   **/
  @JsonProperty("fulltextIndexCollectionDelete")
  public BackupRestoreOperationStatus getFulltextIndexCollectionDelete() {
    return fulltextIndexCollectionDelete;
  }

  /**
   * Setter for fulltextIndexCollectionDelete.
   * The status of the FULLTEXT_INDEX_COLLECTION deletion, which is done before a restore.
   **/
  public void setFulltextIndexCollectionDelete(BackupRestoreOperationStatus fulltextIndexCollectionDelete) {
    this.fulltextIndexCollectionDelete = fulltextIndexCollectionDelete;
  }

  /**
   * Getter for rangerAuditsCollectionDelete.
   * The status of the RANGER_AUDITS_COLLECTION deletion, which is done before a restore.
   **/
  @JsonProperty("rangerAuditsCollectionDelete")
  public BackupRestoreOperationStatus getRangerAuditsCollectionDelete() {
    return rangerAuditsCollectionDelete;
  }

  /**
   * Setter for rangerAuditsCollectionDelete.
   * The status of the RANGER_AUDITS_COLLECTION deletion, which is done before a restore.
   **/
  public void setRangerAuditsCollectionDelete(BackupRestoreOperationStatus rangerAuditsCollectionDelete) {
    this.rangerAuditsCollectionDelete = rangerAuditsCollectionDelete;
  }

  /**
   * Getter for vertexIndexCollectionDelete.
   * The status of the VERTEX_INDEX_COLLECTION deletion, which is done before a restore.
   **/
  @JsonProperty("vertexIndexCollectionDelete")
  public BackupRestoreOperationStatus getVertexIndexCollectionDelete() {
    return vertexIndexCollectionDelete;
  }

  /**
   * Setter for vertexIndexCollectionDelete.
   * The status of the VERTEX_INDEX_COLLECTION deletion, which is done before a restore.
   **/
  public void setVertexIndexCollectionDelete(BackupRestoreOperationStatus vertexIndexCollectionDelete) {
    this.vertexIndexCollectionDelete = vertexIndexCollectionDelete;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolrBackupRestoreState solrBackupRestoreState = (SolrBackupRestoreState) o;
    if (!Objects.equals(this.edgeIndexCollection, solrBackupRestoreState.edgeIndexCollection)) {
      return false;
    }
    if (!Objects.equals(this.fulltextIndexCollection, solrBackupRestoreState.fulltextIndexCollection)) {
      return false;
    }
    if (!Objects.equals(this.rangerAuditsCollection, solrBackupRestoreState.rangerAuditsCollection)) {
      return false;
    }
    if (!Objects.equals(this.vertexIndexCollection, solrBackupRestoreState.vertexIndexCollection)) {
      return false;
    }
    if (!Objects.equals(this.edgeIndexCollectionDelete, solrBackupRestoreState.edgeIndexCollectionDelete)) {
      return false;
    }
    if (!Objects.equals(this.fulltextIndexCollectionDelete, solrBackupRestoreState.fulltextIndexCollectionDelete)) {
      return false;
    }
    if (!Objects.equals(this.rangerAuditsCollectionDelete, solrBackupRestoreState.rangerAuditsCollectionDelete)) {
      return false;
    }
    if (!Objects.equals(this.vertexIndexCollectionDelete, solrBackupRestoreState.vertexIndexCollectionDelete)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(edgeIndexCollection, fulltextIndexCollection, rangerAuditsCollection, vertexIndexCollection, edgeIndexCollectionDelete, fulltextIndexCollectionDelete, rangerAuditsCollectionDelete, vertexIndexCollectionDelete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolrBackupRestoreState {\n");
    sb.append("    edgeIndexCollection: ").append(toIndentedString(edgeIndexCollection)).append("\n");
    sb.append("    fulltextIndexCollection: ").append(toIndentedString(fulltextIndexCollection)).append("\n");
    sb.append("    rangerAuditsCollection: ").append(toIndentedString(rangerAuditsCollection)).append("\n");
    sb.append("    vertexIndexCollection: ").append(toIndentedString(vertexIndexCollection)).append("\n");
    sb.append("    edgeIndexCollectionDelete: ").append(toIndentedString(edgeIndexCollectionDelete)).append("\n");
    sb.append("    fulltextIndexCollectionDelete: ").append(toIndentedString(fulltextIndexCollectionDelete)).append("\n");
    sb.append("    rangerAuditsCollectionDelete: ").append(toIndentedString(rangerAuditsCollectionDelete)).append("\n");
    sb.append("    vertexIndexCollectionDelete: ").append(toIndentedString(vertexIndexCollectionDelete)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line except the first indented by 4 spaces.
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

