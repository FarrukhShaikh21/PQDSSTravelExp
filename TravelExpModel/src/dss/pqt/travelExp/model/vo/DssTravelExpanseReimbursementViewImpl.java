package dss.pqt.travelExp.model.vo;

import dss.pqt.travelExp.model.vo.common.DssTravelExpanseReimbursementView;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Oct 29 13:28:44 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DssTravelExpanseReimbursementViewImpl extends ViewObjectImpl implements DssTravelExpanseReimbursementView {
    /**
     * This is the default constructor (do not remove).
     */
    public DssTravelExpanseReimbursementViewImpl() {
    }


    /**
     * Returns the variable value for NVC_WfDocumentId.
     * @return variable value for NVC_WfDocumentId
     */
    public Number getNVC_WfDocumentId() {
        return (Number) ensureVariableManager().getVariableValue("NVC_WfDocumentId");
    }

    /**
     * Sets <code>value</code> for variable NVC_WfDocumentId.
     * @param value value to bind as NVC_WfDocumentId
     */
    public void setNVC_WfDocumentId(Number value) {
        ensureVariableManager().setVariableValue("NVC_WfDocumentId", value);
        this.exeViewCrieteria(value);
    }
    public void exeViewCrieteria(Number val) {
            ViewObject vo = this.getViewObject();
            ViewCriteria vc = this.getViewCriteria("NotificationViewCriteria");
            vo.applyViewCriteria(vc);
            vo.setNamedWhereClauseParam("NVC_WfDocumentId", val);
            vo.executeQuery();
        }

    /**
     * Returns the variable value for VC_DSS_Branch.
     * @return variable value for VC_DSS_Branch
     */
    public String getVC_DSS_Branch() {
        return (String) ensureVariableManager().getVariableValue("VC_DSS_Branch");
    }

    /**
     * Sets <code>value</code> for variable VC_DSS_Branch.
     * @param value value to bind as VC_DSS_Branch
     */
    public void setVC_DSS_Branch(String value) {
        ensureVariableManager().setVariableValue("VC_DSS_Branch", value);
    }

    /**
     * Returns the variable value for VC_Doc_No.
     * @return variable value for VC_Doc_No
     */
    public String getVC_Doc_No() {
        return (String) ensureVariableManager().getVariableValue("VC_Doc_No");
    }

    /**
     * Sets <code>value</code> for variable VC_Doc_No.
     * @param value value to bind as VC_Doc_No
     */
    public void setVC_Doc_No(String value) {
        ensureVariableManager().setVariableValue("VC_Doc_No", value);
    }

    public void travelExpSearchUser()
    {
                ViewCriteria vc = this.getViewCriteria("DssTravelExpanseReimbursementViewCriteria");
               this.applyViewCriteria(vc);

                 setWhereClause(null);
                 FacesContext fctx = FacesContext.getCurrentInstance();
                 ExternalContext ectx = fctx.getExternalContext();
                 HttpSession userSession = (HttpSession) ectx.getSession(false);
                userSession.setAttribute("SSV_UserDept", 3);
                userSession.setAttribute("pUserId",1139);
                userSession.setAttribute("SSV_UserType","AGENT");

                 Object VUserID = userSession.getAttribute("pUserId") == null ? "0" : userSession.getAttribute("pUserId");
                               if (userSession.getAttribute("SSV_UserType").equals("BO")) {
                                   setWhereClause("((exists (select 1 FROM DSS_SM_USERS AA, PQT_IL_LOC_BRANCH_DTL BD " + " WHERE 1=1" +
                                                  " AND AA.USER_ID_PK  =" + VUserID +
                                                  " AND AA.GIS_LOCATION_ID_FK = BD.IL_LOC_ID_FK " +
                                                  " AND BD.BRANCH_CODE = QRSLT.BRANCH_CODE_FK)))");
                               }                 //              setWhereClause("USER_ID_FK =" + VUserID);
                               executeQuery();
                           }
}

