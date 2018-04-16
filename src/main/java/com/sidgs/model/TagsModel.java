package com.sidgs.model;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Embeddable;
import java.util.Date;

@Embeddable
public class TagsModel {
    private String instance_owner;
    @JsonFormat(pattern = "mm/dd/yyyy")
    private Date expirationDate;
    @JsonFormat(pattern = "mm/dd/yyyy")
    private Date terminationDate;
    private String purpose;
    private String project;
    private String environment;

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
}
