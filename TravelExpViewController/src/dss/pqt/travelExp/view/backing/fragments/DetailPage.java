package dss.pqt.travelExp.view.backing.fragments;

import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;

import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.binding.AttributeBinding;
import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.JboException;

import org.apache.myfaces.trinidad.component.UIXGroup;

public class DetailPage {
    private RichButton b1;
    private RichPanelFormLayout pfl1;
    private RichInputText it1;
    private RichInputText it2;
    private RichInputText it3;
    private RichPanelFormLayout pfl2;
    private RichInputListOfValues agentNameId;
    private RichToolbar t4;
    private UIXGroup g1;
    private RichButton b2;
    private RichPanelLabelAndMessage plam3;
    private RichOutputText ot11;
    private RichPanelHeader ph2;
    private RichInputComboboxListOfValues branchNameId;
    private RichInputText it4;

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }


    public void setAgentNameId(RichInputListOfValues agentNameId) {
        this.agentNameId = agentNameId;
    }

    public RichInputListOfValues getAgentNameId() {
        return agentNameId;
    }

    public String Branch_action() {
        // Add event code here...
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding operation = bindings.getOperationBinding("callWorkflow");
        operation.getParamsMap().put("p_document_id", getAttributeValue("VoucherIdPk"));
        operation.getParamsMap().put("ApprovalType", "BRANCH");
        Object result = operation.execute();
        if (!operation.getErrors().isEmpty()) {
            JboException ex = new JboException("Some thing went wrong while sending Notification.");
            BindingContext bctx = BindingContext.getCurrent();
            ((DCBindingContainer) bctx.getCurrentBindingsEntry()).reportException(ex);
        }
        this.SendMessage();
        return "backQuery";
    }

    public String Dss_action() {
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding operation = bindings.getOperationBinding("callWorkflow");
        operation.getParamsMap().put("p_document_id", getAttributeValue("VoucherIdPk"));
        operation.getParamsMap().put("ApprovalType", "DSS");
        Object result = operation.execute();
        if (!operation.getErrors().isEmpty()) {
            JboException ex = new JboException("Some thing went wrong while sending Notification.");
            BindingContext bctx = BindingContext.getCurrent();
            ((DCBindingContainer) bctx.getCurrentBindingsEntry()).reportException(ex);
        }
        this.SendMessage();
        return "backQuery";
    }

    public Object getAttributeValue(String AttrName) {
        BindingContainer bdCont = BindingContext.getCurrent().getCurrentBindingsEntry();
        AttributeBinding val = (AttributeBinding) bdCont.getControlBinding(AttrName);
        return val.getInputValue();
    }

    public String Approve_action() {
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding operation = bindings.getOperationBinding("DssApprove");
        operation.execute();
        this.SendMessage();
        return "backQuery";
    }

    public void SendMessage() {
        FacesMessage Message = new FacesMessage("Workflow has been submitted successfully!");
        Message.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage(null, Message);
    }


    public void setT4(RichToolbar t4) {
        this.t4 = t4;
    }

    public RichToolbar getT4() {
        return t4;
    }

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }


    public void setPlam3(RichPanelLabelAndMessage plam3) {
        this.plam3 = plam3;
    }

    public RichPanelLabelAndMessage getPlam3() {
        return plam3;
    }

    public void setOt11(RichOutputText ot11) {
        this.ot11 = ot11;
    }

    public RichOutputText getOt11() {
        return ot11;
    }

    public void setPh2(RichPanelHeader ph2) {
        this.ph2 = ph2;
    }

    public RichPanelHeader getPh2() {
        return ph2;
    }

    public void setBranchNameId(RichInputComboboxListOfValues branchNameId) {
        this.branchNameId = branchNameId;
    }

    public RichInputComboboxListOfValues getBranchNameId() {
        return branchNameId;
    }
    public String SubmitForApproval() {
          // Add event code here...
          BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
          OperationBinding operation = bindings.getOperationBinding("callTravelExpWorkflow");
          operation.getParamsMap().put("p_document_id", getAttributeValue("VoucherIdPk"));
          operation.execute();

          return "backQuery";
      }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }
}
