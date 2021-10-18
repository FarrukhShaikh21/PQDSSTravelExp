package dss.pqt.travelExp.model.am;

import dss.pqt.travelExp.model.am.common.TravelExpAppl;
import dss.pqt.travelExp.model.vo.DssTravelExpanseReimbursementViewImpl;

import java.sql.SQLException;
import java.sql.Types;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.jbo.JboException;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.DBTransaction;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;

import oracle.jdbc.OracleCallableStatement;

import oracle.sql.NUMBER;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Oct 28 18:59:24 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TravelExpApplImpl extends ApplicationModuleImpl implements TravelExpAppl {
    /**
     * This is the default constructor (do not remove).
     */
    public TravelExpApplImpl() {
    }

    /**
     * Container's getter for DssTravelExpanseReimbursementView1.
     * @return DssTravelExpanseReimbursementView1
     */
   
    public ViewObjectImpl getWfSetupDetailVO1() {
        return (ViewObjectImpl) findViewObject("WfSetupDetailVO1");
    }
 
    public ViewObjectImpl getFromUserVO1() {
        return (ViewObjectImpl) findViewObject("FromUserVO1");
    }
   
    public void Apply() {
        if (getDBTransaction().isDirty()) {
            getDBTransaction().commit();
            FacesMessage Message = new FacesMessage("Record Saved Successfully!");
            Message.setSeverity(FacesMessage.SEVERITY_INFO);
            FacesContext fc = FacesContext.getCurrentInstance();
            fc.addMessage(null, Message);
        }
    }
    public void DeleteCommit() {
        if (getDBTransaction().isDirty()) {
            getDBTransaction().commit();
            FacesMessage Message = new FacesMessage("Record has been deleted Successfully!");
            Message.setSeverity(FacesMessage.SEVERITY_INFO);
            FacesContext fc = FacesContext.getCurrentInstance();
            fc.addMessage(null, Message);
        }
    }
    public void callWorkflow(Number p_document_id, String ApprovalType) {
        NUMBER vNotifId;
        Number p_wf_notif_id = null, p_wf_setup_id = null, p_form_id = null, p_from_user_id = null;
        String p_notification_message = "Approval Required for Travel Expanse.", p_status = null;

        ViewObject WfVO = this.getWfSetupDetailVO1();
        WfVO.setWhereClause("WORKFLOW_TYPE='" + ApprovalType + "'");
        WfVO.executeQuery();
        if (WfVO.getRowCount() == 0) {
            throw new JboException("Workflow Hierarchy does not exists.");
        } else if (WfVO.getRowCount() > 1) {
            throw new JboException("Multiple Workflow Hierarchy exists.");
        } else if (WfVO.getRowCount() == 1) {
            p_wf_setup_id = (Number) WfVO.first().getAttribute(0);
            p_form_id = (Number) WfVO.first().getAttribute(1);

            ViewObject vo = this.getDssTravelExpanseReimbursementView1();
            if (vo.getRowCount() == 0) {
                throw new JboException("Please select Agent for Travel Expense.");
            } else if (vo.getRowCount() > 0) {
                ViewObject FU = this.getFromUserVO1();
                FU.setWhereClause("USER_ID_PK = " + vo.first().getAttribute("UserIdFk"));
                System.out.println(FU.getQuery());
                FU.executeQuery();
                if (FU.getRowCount() == 1) {
                    p_from_user_id = (Number) vo.first().getAttribute("UserIdFk");
                } else if (FU.getRowCount() == 0) {
                    throw new JboException("Manager does not exists.");
                } else if (FU.getRowCount() > 1) {
                    throw new JboException("Multiple Manager exists.");
                }
            }

            DBTransaction txn = getDBTransaction();
            OracleCallableStatement callableStatement = null;
            if ("BRANCH".equalsIgnoreCase(ApprovalType))
                callableStatement =
                    (OracleCallableStatement) txn.createCallableStatement("BEGIN DSS_SWF_PKG.CALL_WORKFLOW(:1, :2, :3, :4, :5, :6, :7, :8); END;",
                                                                          DBTransaction.DEFAULT);
            else if ("DSS".equalsIgnoreCase(ApprovalType))
                callableStatement =
                    (OracleCallableStatement) txn.createCallableStatement("BEGIN DSS_SWF_PKG.CALL_DSS_WORKFLOW(:1, :2, :3, :4, :5, :6, :7, :8); END;",
                                                                          DBTransaction.DEFAULT);
            try {
                callableStatement.setNUMBER(1, (NUMBER) p_document_id);
                callableStatement.setNUMBER(2, (NUMBER) p_wf_notif_id);
                callableStatement.setNUMBER(3, (NUMBER) p_wf_setup_id);
                callableStatement.setNUMBER(4, p_form_id);
                callableStatement.setNUMBER(5, p_from_user_id);
                callableStatement.setString(6, p_notification_message);
                callableStatement.setString(7, p_status);
                callableStatement.registerOutParameter(8, Types.NUMERIC);

                callableStatement.execute();
                vNotifId = callableStatement.getNUMBER(8);
                callableStatement.close();
                if (vNotifId != null) {
                    if ("BRANCH".equalsIgnoreCase(ApprovalType)) {
                        this.getDssTravelExpanseReimbursementView1().getCurrentRow().setAttribute("BranchStatus", "INPROCESS");
                        this.getDssTravelExpanseReimbursementView1().getCurrentRow().setAttribute("BranchNotifIdFk", vNotifId);
                    } else if ("DSS".equalsIgnoreCase(ApprovalType)) {
                        this.getDssTravelExpanseReimbursementView1().getCurrentRow().setAttribute("DssStatus", "INPROCESS");
                        this.getDssTravelExpanseReimbursementView1().getCurrentRow().setAttribute("DssNotifIdFk", vNotifId);
                    }
                    getDBTransaction().commit();
                }
            } catch (SQLException e) {
                throw new JboException(e.getMessage());
            }
        }
        this.getDssTravelExpanseReimbursementView1().executeQuery();
    }
    public void DssApprove() {
        ViewObject vo = this.getDssTravelExpanseReimbursementView1();
        vo.getCurrentRow().setAttribute("DssStatus", "APPROVED");
        getDBTransaction().commit();
    }

    /**
     * Container's getter for DssTravelexpanseAmountDtlView1.
     * @return DssTravelexpanseAmountDtlView1
     */
    public ViewObjectImpl getDssTravelexpanseAmountDtlView1() {
        return (ViewObjectImpl) findViewObject("DssTravelexpanseAmountDtlView1");
    }

    /**
     * Container's getter for DssTravelexpanseDetailView1.
     * @return DssTravelexpanseDetailView1
     */
    public ViewObjectImpl getDssTravelexpanseDetailView1() {
        return (ViewObjectImpl) findViewObject("DssTravelexpanseDetailView1");
    }

    /**
     * Container's getter for DssTravelExpansePurposeDtlView1.
     * @return DssTravelExpansePurposeDtlView1
     */
    public ViewObjectImpl getDssTravelExpansePurposeDtlView1() {
        return (ViewObjectImpl) findViewObject("DssTravelExpansePurposeDtlView1");
    }

    /**
     * Container's getter for DssTravelExpanseAmountDtlVL1.
     * @return DssTravelExpanseAmountDtlVL1
     */
    public ViewLinkImpl getDssTravelExpanseAmountDtlVL1() {
        return (ViewLinkImpl) findViewLink("DssTravelExpanseAmountDtlVL1");
    }

    /**
     * Container's getter for DssTravelExpanseDtlVL1.
     * @return DssTravelExpanseDtlVL1
     */
    public ViewLinkImpl getDssTravelExpanseDtlVL1() {
        return (ViewLinkImpl) findViewLink("DssTravelExpanseDtlVL1");
    }

    /**
     * Container's getter for DssTravelExpansePurposeDtlVL1.
     * @return DssTravelExpansePurposeDtlVL1
     */
    public ViewLinkImpl getDssTravelExpansePurposeDtlVL1() {
        return (ViewLinkImpl) findViewLink("DssTravelExpansePurposeDtlVL1");
    }

    private ViewObject DssTravelExpanseReimbursementView1() {
        return null;
    }

    /**
     * Container's getter for DssTravelExpanseReimbursementView1.
     * @return DssTravelExpanseReimbursementView1
     */
    public DssTravelExpanseReimbursementViewImpl getDssTravelExpanseReimbursementView1() {
        return (DssTravelExpanseReimbursementViewImpl) findViewObject("DssTravelExpanseReimbursementView1");
    }
    public void callTravelExpWorkflow(Number p_document_id) {
            String vStatus = null, vMsg = null;

            DBTransaction txn = getDBTransaction();
            OracleCallableStatement callableStatement = null;

            callableStatement =
                (OracleCallableStatement) txn.createCallableStatement("BEGIN dss_all_pkg.CALL_TRAVEL_EXP_WORKFLOW(:1, :2, :3); END;",
                                                                      DBTransaction.DEFAULT);

            try {
                callableStatement.setNUMBER(1, (NUMBER) p_document_id);
                callableStatement.registerOutParameter(2, Types.VARCHAR);
                callableStatement.registerOutParameter(3, Types.VARCHAR);

                callableStatement.execute();

                vStatus = callableStatement.getString(2);
                vMsg = callableStatement.getString(3);

                callableStatement.close();
            } catch (SQLException e) {
                try {
                    callableStatement.close();
                } catch (SQLException f) {
                }
                throw new JboException(e.getMessage());
            }

            FacesMessage Message = new FacesMessage(vMsg);
            if (vStatus.equalsIgnoreCase("N"))
                Message.setSeverity(FacesMessage.SEVERITY_ERROR);
            else
                Message.setSeverity(FacesMessage.SEVERITY_INFO);
            FacesContext fc = FacesContext.getCurrentInstance();
            fc.addMessage(null, Message);
            txn.rollback();
        }
}

