package org.krynicki.hibernate.dto;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.*;

/**
 * Created by K on 2016-08-28.
 */

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue
    private int userId;

    @Basic
    @Column(name = "USER_NAME")
    private String userName;

    @Temporal(TemporalType.DATE)
    private Date joiningDate;

    @ElementCollection
    @JoinTable(name = "Adresses", joinColumns = @JoinColumn(name = "USER_ID"))
    @GenericGenerator(name = "increment-gen", strategy = "increment")
    @CollectionId(columns = {@Column(name = "ADDRESS_ID")}, type = @Type(type = "long"), generator = "increment-gen")
    private Collection<Address> addresses = new ArrayList<>();

    @Lob
    private String description;

    @Transient
    private String notToBeSaved;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void setAddresses(Collection<Address> addresses) {
        this.addresses = addresses;
    }

    public Collection<Address> getAddresses() { return this.addresses; }

    public String getNotToBeSaved() {
        return notToBeSaved;
    }

}
