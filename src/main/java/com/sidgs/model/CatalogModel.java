package com.sidgs.model;

//import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.repository.Temporal;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.TemporalType.DATE;


/**
 * catalog model
 */
@Entity
public class CatalogModel {

         @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        private String instance_id;
        private String instance_type;
        private String instance_owner;
        @JsonFormat(pattern = "dd/mm/yyyy")
        private Date expirationDate;
        @JsonFormat(pattern = "dd/mm/yyyy")
        private Date terminationDate;
        private String purpose;
        private String project;
        private String environment;
        private String ip_address;
        private String ip_public;
        private String keyName;
        private String cloud;
        private String status;




         public int getId() {return id;}

         public void setId(int id) {this.id = id;}

         public String getInstance_id() {
        return instance_id;
    }

         public void setInstance_id(String instance_id) {
        this.instance_id = instance_id;
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

        public Date getExpirationDate() {
            return expirationDate;
        }

        public void setExpirationDate(Date expirationDate) {
            this.expirationDate = expirationDate;
        }

        public Date getTerminationDate() {
            return terminationDate;
        }

        public void setTerminationDate(Date terminationDate) {
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
