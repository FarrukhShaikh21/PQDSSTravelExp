package dss.pqt.travelExp.model.am.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Oct 29 13:52:56 PKT 2016
// ---------------------------------------------------------------------
public interface TravelExpAppl extends ApplicationModule {
    void Apply();

    void DeleteCommit();

    void DssApprove();

    void callWorkflow(oracle.jbo.domain.Number p_document_id, String ApprovalType);

    void callTravelExpWorkflow(oracle.jbo.domain.Number p_document_id);
}

