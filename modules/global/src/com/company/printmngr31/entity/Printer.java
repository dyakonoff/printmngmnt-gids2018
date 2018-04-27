package com.company.printmngr31.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "PRINTMNGR31_PRINTER")
@Entity(name = "printmngr31$Printer")
public class Printer extends StandardEntity {
    private static final long serialVersionUID = 2710121204427247107L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "IP_ADDRESS", nullable = false, length = 40)
    protected String ipAddress;

    @Max(65535)
    @Min(1)
    @NotNull
    @Column(name = "PORT", nullable = false)
    protected Integer port;

    @Lob
    @Column(name = "LOCATION")
    protected String location;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getPort() {
        return port;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }


}