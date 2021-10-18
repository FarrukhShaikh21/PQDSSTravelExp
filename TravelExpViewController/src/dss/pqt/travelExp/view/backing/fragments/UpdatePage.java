package dss.pqt.travelExp.view.backing.fragments;

import javax.faces.application.FacesMessage;
import javax.faces.component.UISelectItems;

import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelDashboard;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichSeparator;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class UpdatePage {
    private RichPanelHeader ph1;
    private RichToolbar t5;
    private RichButton b3;
    private RichButton b4;
    private RichSelectOneChoice soc1;
    private UISelectItems si1;
    private RichSelectOneChoice soc2;
    private UISelectItems si2;
    private RichSelectOneChoice soc3;
    private UISelectItems si3;
    private RichSelectOneChoice soc4;
    private UISelectItems si4;
    private RichSelectOneChoice soc5;
    private UISelectItems si5;
    private RichPanelGroupLayout pgl1;
    private RichSeparator s1;
    private RichPanelBox pb1;
    private RichPanelBox pb2;
    private RichSeparator s2;
    private RichTable t2;
    private RichTable t1;
    private RichPanelBox pb3;
    private RichTable t3;
    private RichToolbar t4;
    private RichToolbar t6;
    private RichToolbar t7;
    private RichButton b1;
    private RichButton b2;
    private RichButton b5;
    private RichPanelFormLayout pfl1;
    private RichPanelDashboard pd1;
    private RichPanelBox pb4;
    private RichPanelFormLayout pfl2;
    private RichInputText it8;
    private RichInputText it9;
    private RichInputText it10;
    private RichPanelDashboard pd2;
    private RichToolbar t8;
    private RichInputListOfValues agentNameId;
    private RichPanelLabelAndMessage plam1;
    private RichOutputText ot1;
    private RichInputListOfValues branchNameId;
    private RichSelectOneChoice soc7;
    private UISelectItems si7;
    private RichOutputText ot2;
    private RichOutputText ot3;

    public void setPh1(RichPanelHeader ph1) {
        this.ph1 = ph1;
    }

    public RichPanelHeader getPh1() {
        return ph1;
    }


    public void setT5(RichToolbar t5) {
        this.t5 = t5;
    }

    public RichToolbar getT5() {
        return t5;
    }


    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }


    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }

    public void setSi1(UISelectItems si1) {
        this.si1 = si1;
    }

    public UISelectItems getSi1() {
        return si1;
    }

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }

    public void setSi2(UISelectItems si2) {
        this.si2 = si2;
    }

    public UISelectItems getSi2() {
        return si2;
    }

    public void setSoc3(RichSelectOneChoice soc3) {
        this.soc3 = soc3;
    }

    public RichSelectOneChoice getSoc3() {
        return soc3;
    }

    public void setSi3(UISelectItems si3) {
        this.si3 = si3;
    }

    public UISelectItems getSi3() {
        return si3;
    }

    public void setSoc4(RichSelectOneChoice soc4) {
        this.soc4 = soc4;
    }

    public RichSelectOneChoice getSoc4() {
        return soc4;
    }

    public void setSi4(UISelectItems si4) {
        this.si4 = si4;
    }

    public UISelectItems getSi4() {
        return si4;
    }


    public void setSoc5(RichSelectOneChoice soc5) {
        this.soc5 = soc5;
    }

    public RichSelectOneChoice getSoc5() {
        return soc5;
    }

    public void setSi5(UISelectItems si5) {
        this.si5 = si5;
    }

    public UISelectItems getSi5() {
        return si5;
    }


    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setS1(RichSeparator s1) {
        this.s1 = s1;
    }

    public RichSeparator getS1() {
        return s1;
    }

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }

    public void setPb2(RichPanelBox pb2) {
        this.pb2 = pb2;
    }

    public RichPanelBox getPb2() {
        return pb2;
    }

    public void setS2(RichSeparator s2) {
        this.s2 = s2;
    }

    public RichSeparator getS2() {
        return s2;
    }


    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setPb3(RichPanelBox pb3) {
        this.pb3 = pb3;
    }

    public RichPanelBox getPb3() {
        return pb3;
    }

    public void setT3(RichTable t3) {
        this.t3 = t3;
    }

    public RichTable getT3() {
        return t3;
    }

    public void setT4(RichToolbar t4) {
        this.t4 = t4;
    }

    public RichToolbar getT4() {
        return t4;
    }

    public void setT6(RichToolbar t6) {
        this.t6 = t6;
    }

    public RichToolbar getT6() {
        return t6;
    }

    public void setT7(RichToolbar t7) {
        this.t7 = t7;
    }

    public RichToolbar getT7() {
        return t7;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setB5(RichButton b5) {
        this.b5 = b5;
    }

    public RichButton getB5() {
        return b5;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }


    public void setPd1(RichPanelDashboard pd1) {
        this.pd1 = pd1;
    }

    public RichPanelDashboard getPd1() {
        return pd1;
    }

    public void setPb4(RichPanelBox pb4) {
        this.pb4 = pb4;
    }

    public RichPanelBox getPb4() {
        return pb4;
    }

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
    }

    public void setPd2(RichPanelDashboard pd2) {
        this.pd2 = pd2;
    }

    public RichPanelDashboard getPd2() {
        return pd2;
    }

    public void setT8(RichToolbar t8) {
        this.t8 = t8;
    }

    public RichToolbar getT8() {
        return t8;
    }


    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    
    public String applyButtonnAction() {
           //int a = 0;                          
//                   a = Integer.parseInt(this.getIt10().getValue().toString());
                   BindingContainer bindings = getBindings();
                   OperationBinding operationBinding = bindings.getOperationBinding("Commit");
                   operationBinding.execute();
                   FacesMessage msg = new FacesMessage("Your record has been saved successfully");
                   msg.setSeverity(FacesMessage.SEVERITY_INFO);
                   FacesContext context = FacesContext.getCurrentInstance();
                   context.addMessage(null, msg);
               
           return null;
       }
    public String detailDelete() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete1");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        BindingContainer b = getBindings();
        OperationBinding operationBinding1 = b.getOperationBinding("Commit");
        Object result1 = operationBinding1.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        {
        FacesMessage msg = new FacesMessage("Your record has been deleted successfully");
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, msg);
        }
        return null;
    }

    public String amountDetailDelete() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        BindingContainer b = getBindings();
        OperationBinding operationBinding1 = b.getOperationBinding("Commit");
        Object result1 = operationBinding1.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        {
        FacesMessage msg = new FacesMessage("Your record has been deleted successfully");
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, msg);
        }
        return null;
    }

    public String purposeDeleteAction() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete2");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        BindingContainer b = getBindings();
        OperationBinding operationBinding1 = b.getOperationBinding("Commit");
        Object result1 = operationBinding1.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        {
        FacesMessage msg = new FacesMessage("Your record has been deleted successfully");
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, msg);
        }
        return null;
    }

    public void setAgentNameId(RichInputListOfValues agentNameId) {
        this.agentNameId = agentNameId;
    }

    public RichInputListOfValues getAgentNameId() {
        return agentNameId;
    }


    public void setPlam1(RichPanelLabelAndMessage plam1) {
        this.plam1 = plam1;
    }

    public RichPanelLabelAndMessage getPlam1() {
        return plam1;
    }

    public void setOt1(RichOutputText ot1) {
        this.ot1 = ot1;
    }

    public RichOutputText getOt1() {
        return ot1;
    }


    public void setBranchNameId(RichInputListOfValues branchNameId) {
        this.branchNameId = branchNameId;
    }

    public RichInputListOfValues getBranchNameId() {
        return branchNameId;
    }

    public void setSoc7(RichSelectOneChoice soc7) {
        this.soc7 = soc7;
    }

    public RichSelectOneChoice getSoc7() {
        return soc7;
    }

    public void setSi7(UISelectItems si7) {
        this.si7 = si7;
    }

    public UISelectItems getSi7() {
        return si7;
    }

    public void setOt2(RichOutputText ot2) {
        this.ot2 = ot2;
    }

    public RichOutputText getOt2() {
        return ot2;
    }

    public void setOt3(RichOutputText ot3) {
        this.ot3 = ot3;
    }

    public RichOutputText getOt3() {
        return ot3;
    }
}
