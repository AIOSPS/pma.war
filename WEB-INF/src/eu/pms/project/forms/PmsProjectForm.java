package eu.pms.project.forms;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.Date;

/** @author Hibernate CodeGenerator */
public class PmsProjectForm  extends ActionForm {
    private String proId;
    private String proTitle;
    private String proDescription;
    private String proStatus;
    private String proStatusDesc;
    private String proBudgetTxt;
    private java.math.BigDecimal proBudget;
    private String proStartDate;
    private String proEndDate;
    private String proNeedPermit;
    private String proNeedPermitDesc;
    private String proHasCluster;
    private String proHasClusterDesc;
    private String proNotes;
    private String proArea;
    private String username;
    private String timeStamp;
    private String prgId;
    private String devId;
    private String secId;
    private String subSecId;
    private String secType;
    private String preId;

    private String[] donorProjectList;
    private String[] implementerProjectList;
    private String[] communityProjectList;
    private String[] indicatorProjectList;



    /** default constructor */
    public PmsProjectForm() {
    }

    public String getProId() {
        return this.proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProTitle() {
        return this.proTitle;
    }

    public void setProTitle(String proTitle) {
        this.proTitle = proTitle;
    }

    public String getProDescription() {
        return this.proDescription;
    }

    public void setProDescription(String proDescription) {
        this.proDescription = proDescription;
    }

    public String getProStatus() {
        return this.proStatus;
    }

    public void setProStatus(String proStatus) {
        this.proStatus = proStatus;
    }

    public java.math.BigDecimal getProBudget() {
        return this.proBudget;
    }

    public void setProBudget(java.math.BigDecimal proBudget) {
        this.proBudget = proBudget;
    }

    public String getProStartDate() {
        return this.proStartDate;
    }

    public void setProStartDate(String proStartDate) {
        this.proStartDate = proStartDate;
    }

    public String getProEndDate() {
        return this.proEndDate;
    }

    public void setProEndDate(String proEndDate) {
        this.proEndDate = proEndDate;
    }

    public String getProNeedPermit() {
        return this.proNeedPermit;
    }

    public void setProNeedPermit(String proNeedPermit) {
        this.proNeedPermit = proNeedPermit;
    }

    public String getProHasCluster() {
        return this.proHasCluster;
    }

    public void setProHasCluster(String proHasCluster) {
        this.proHasCluster = proHasCluster;
    }

    public String getProNotes() {
        return this.proNotes;
    }

    public void setProNotes(String proNotes) {
        this.proNotes = proNotes;
    }

    public String getProArea() {
        return this.proArea;
    }

    public void setProArea(String proArea) {
        this.proArea = proArea;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getPrgId() {
        return prgId;
    }

    public void setPrgId(String prgId) {
        this.prgId = prgId;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getSecId() {
        return secId;
    }

    public void setSecId(String secId) {
        this.secId = secId;
    }

    public String getSecType() {
        return secType;
    }

    public void setSecType(String secType) {
        this.secType = secType;
    }

    public String getPreId() {
        return preId;
    }

    public void setPreId(String preId) {
        this.preId = preId;
    }

    public String[] getDonorProjectList() {
        return donorProjectList;
    }

    public void setDonorProjectList(String[] donorProjectList) {
        this.donorProjectList = donorProjectList;
    }

    public String[] getImplementerProjectList() {
        return implementerProjectList;
    }

    public void setImplementerProjectList(String[] implementerProjectList) {
        this.implementerProjectList = implementerProjectList;
    }


    public String[] getCommunityProjectList() {
        return communityProjectList;
    }

    public void setCommunityProjectList(String[] communityProjectList) {
        this.communityProjectList = communityProjectList;
    }


    public String[] getIndicatorProjectList() {
        return indicatorProjectList;
    }

    public void setIndicatorProjectList(String[] indicatorProjectList) {
        this.indicatorProjectList = indicatorProjectList;
    }

    public String getProBudgetTxt() {
        return proBudgetTxt;
    }

    public String getProStatusDesc() {
        if(getProStatus()!=null) {
            if (getProStatus().equals("1")) {
                proStatusDesc = "Design / Approval";
            } else if (getProStatus().equals("2")) {
                proStatusDesc = "Ongoing";
            } else if (getProStatus().equals("3")) {
                proStatusDesc = "Delayed";
            } else if (getProStatus().equals("4")) {
                proStatusDesc = "Completed";
            } else if (getProStatus().equals("5")) {
                proStatusDesc = "On-Hold";
            } else if (getProStatus().equals("6")) {
                proStatusDesc = "Closed";
            } else if (getProStatus().equals("7")) {
                proStatusDesc = "Cancelled";
            }
        }else proStatusDesc="";
        return proStatusDesc;
    }

    public void setProStatusDesc(String proStatusDesc) {
        this.proStatusDesc = proStatusDesc;
    }

    public String getProNeedPermitDesc() {
        if(getProNeedPermit()!=null) {
            if (getProNeedPermit().equals("0")) {
                proNeedPermitDesc = "No";
            } else if (getProNeedPermit().equals("1")) {
                proNeedPermitDesc = "Yes";
            }
        }else proNeedPermitDesc="";
        return proNeedPermitDesc;
    }

    public void setProNeedPermitDesc(String proNeedPermitDesc) {
        this.proNeedPermitDesc = proNeedPermitDesc;
    }

    public String getProHasClusterDesc() {
        if(getProHasCluster()!=null) {
            if (getProHasCluster().equals("0")) {
                proHasClusterDesc = "No";
            } else if (getProHasCluster().equals("1")) {
                proHasClusterDesc = "Yes";
            }
        }else proHasClusterDesc="";
        return proHasClusterDesc;
    }

    public void setProHasClusterDesc(String proHasClusterDesc) {
        this.proHasClusterDesc = proHasClusterDesc;
    }

    public void setProBudgetTxt(String proBudgetTxt) {
        this.proBudgetTxt = proBudgetTxt;
    }

    public String getSubSecId() {
        return subSecId;
    }

    public void setSubSecId(String subSecId) {
        this.subSecId = subSecId;
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        proId=null;
        proTitle=null;
        proDescription=null;
        proStatus=null;
        proBudget=null;
        proStartDate=null;
        proEndDate=null;
        proNeedPermit=null;
        proHasCluster=null;
        proNotes=null;
        proArea=null;
        username=null;
        timeStamp=null;
        prgId=null;
        devId=null;
        secId=null;
        subSecId=null;
        secType=null;
        preId=null;

        donorProjectList=null;
        implementerProjectList=null;
        communityProjectList=null;
        indicatorProjectList=null;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }

}
