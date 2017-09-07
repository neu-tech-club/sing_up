package entity;

import javax.persistence.*;

/**
 * Created by tend on 2017/9/7.
 */
@Entity
@Table(name = "ibm", schema = "ydw_uploader", catalog = "")
public class IbmEntity {
    private int id;
    private String stuId;
    private String phone;
    private String college;
    private String selector;
    private String club;
    private String stuName;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "stu_id")
    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "college")
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Basic
    @Column(name = "selector")
    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    @Basic
    @Column(name = "club")
    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Basic
    @Column(name = "stu_name")
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IbmEntity ibmEntity = (IbmEntity) o;

        if (id != ibmEntity.id) return false;
        if (stuId != null ? !stuId.equals(ibmEntity.stuId) : ibmEntity.stuId != null) return false;
        if (phone != null ? !phone.equals(ibmEntity.phone) : ibmEntity.phone != null) return false;
        if (college != null ? !college.equals(ibmEntity.college) : ibmEntity.college != null) return false;
        if (selector != null ? !selector.equals(ibmEntity.selector) : ibmEntity.selector != null) return false;
        if (club != null ? !club.equals(ibmEntity.club) : ibmEntity.club != null) return false;
        if (stuName != null ? !stuName.equals(ibmEntity.stuName) : ibmEntity.stuName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (stuId != null ? stuId.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (college != null ? college.hashCode() : 0);
        result = 31 * result + (selector != null ? selector.hashCode() : 0);
        result = 31 * result + (club != null ? club.hashCode() : 0);
        result = 31 * result + (stuName != null ? stuName.hashCode() : 0);
        return result;
    }
}
