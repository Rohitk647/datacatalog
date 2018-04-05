package com.sidgs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "catalog")
public class CatalogModel {

        @Id
        private int id;
        private String instance_id;
        private String instance_type;
        private String instance_owner;
        private String expirationDate;
        private String terminationDate;
        private String purpose;
        private String project;
        private String environment;
        private String ip_address;
        private String ip_public;
        private String keyName;
        private String cloud;
        private String status;

    public CatalogModel(int id, String instance_id, String instance_type, String instance_owner, String expirationDate, String terminationDate, String purpose, String project, String environment, String ip_address, String ip_public, String keyName, String cloud, String status) {
        this.id = id;
        this.instance_id = instance_id;
        this.instance_type = instance_type;
        this.instance_owner = instance_owner;
        this.expirationDate = expirationDate;
        this.terminationDate = terminationDate;
        this.purpose = purpose;
        this.project = project;
        this.environment = environment;
        this.ip_address = ip_address;
        this.ip_public = ip_public;
        this.keyName = keyName;
        this.cloud = cloud;
        this.status = status;
    }

    public CatalogModel(){}

    public String getInstance_id() {
        return instance_id;
    }

    public void setInstance_id(String instance_id) {
        this.instance_id = instance_id;
    }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getInstance_type() {
            return instance_type;
        }

        public void setInstance_type(String instance_type) {
            this.instance_type = instance_type;
        }

        public String getInstance_owner() {
            return instance_owner;
        }

        public void setInstance_owner(String instance_owner) {
            this.instance_owner = instance_owner;
        }

        public String getExpirationDate() {
            return expirationDate;
        }

        public void setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
        }

        public String getTerminationDate() {
            return terminationDate;
        }

        public void setTerminationDate(String terminationDate) {
            this.terminationDate = terminationDate;
        }

        public String getPurpose() {
            return purpose;
        }

        public void setPurpose(String purpose) {
            this.purpose = purpose;
        }

        public String getProject() {
            return project;
        }

        public void setProject(String project) {
            this.project = project;
        }

        public String getEnvironment() {
            return environment;
        }

        public void setEnvironment(String environment) {
            this.environment = environment;
        }

        public String getIp_address() {
            return ip_address;
        }

        public void setIp_address(String ip_address) {
            this.ip_address = ip_address;
        }

        public String getIp_public() {
            return ip_public;
        }

        public void setIp_public(String ip_public) {
            this.ip_public = ip_public;
        }

        public String getKeyName() {
            return keyName;
        }

        public void setKeyName(String keyName) {
            this.keyName = keyName;
        }

        public String getCloud() {
            return cloud;
        }

        public void setCloud(String cloud) {
            this.cloud = cloud;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

    @Override
    public String toString() {
        return "CatalogModel{" +
                "id=" + id +
                ", instance_id='" + instance_id + '\'' +
                ", instance_type='" + instance_type + '\'' +
                ", instance_owner='" + instance_owner + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", terminationDate='" + terminationDate + '\'' +
                ", purpose='" + purpose + '\'' +
                ", project='" + project + '\'' +
                ", environment='" + environment + '\'' +
                ", ip_address='" + ip_address + '\'' +
                ", ip_public='" + ip_public + '\'' +
                ", keyName='" + keyName + '\'' +
                ", cloud='" + cloud + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
