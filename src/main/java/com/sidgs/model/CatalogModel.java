package com.sidgs.model;
import javax.persistence.*;


/**
 * catalog model
 */
@Entity
public class CatalogModel {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        @Column(unique = true)
        private String instance_id;
        private String instance_type;
        private String ip_address;
        private String ip_public;
        private String keyName;
        private String cloud;
        private String status;
        @Embedded
        private TagsModel tags;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public TagsModel getTags() {
        return tags;
    }

    public void setTags(TagsModel tags) {
        this.tags = tags;
    }
}
