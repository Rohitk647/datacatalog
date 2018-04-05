package com.sidgs.catalogservice.model;

import java.util.Date;

public class CatalogModel {

        private String id;
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

        public String getId() {
            return id;
        }

        public void setId(String id) {
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
}
