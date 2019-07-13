package com.github.seratch.jslack.api.model.event;

import java.util.List;

/**
 * The team_plan_change event is sent to all connections for a workspace when a the current billing plan is changed.
 * Currently possible values are: empty string, comp, std, plus.
 * <p>
 * https://api.slack.com/events/team_plan_change
 */
public class TeamPlanChangeEvent implements Event {

    public static final String TYPE_NAME = "team_plan_change";

    private final String type = TYPE_NAME;
    private String plan; // possible values are: empty string, comp, std, plus
    private boolean canAddUra;
    private List<String> paidFeatures;

    public TeamPlanChangeEvent() {
    }

    public String getType() {
        return this.type;
    }

    public String getPlan() {
        return this.plan;
    }

    public boolean isCanAddUra() {
        return this.canAddUra;
    }

    public List<String> getPaidFeatures() {
        return this.paidFeatures;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public void setCanAddUra(boolean canAddUra) {
        this.canAddUra = canAddUra;
    }

    public void setPaidFeatures(List<String> paidFeatures) {
        this.paidFeatures = paidFeatures;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TeamPlanChangeEvent)) return false;
        final TeamPlanChangeEvent other = (TeamPlanChangeEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$plan = this.getPlan();
        final Object other$plan = other.getPlan();
        if (this$plan == null ? other$plan != null : !this$plan.equals(other$plan)) return false;
        if (this.isCanAddUra() != other.isCanAddUra()) return false;
        final Object this$paidFeatures = this.getPaidFeatures();
        final Object other$paidFeatures = other.getPaidFeatures();
        if (this$paidFeatures == null ? other$paidFeatures != null : !this$paidFeatures.equals(other$paidFeatures))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TeamPlanChangeEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $plan = this.getPlan();
        result = result * PRIME + ($plan == null ? 43 : $plan.hashCode());
        result = result * PRIME + (this.isCanAddUra() ? 79 : 97);
        final Object $paidFeatures = this.getPaidFeatures();
        result = result * PRIME + ($paidFeatures == null ? 43 : $paidFeatures.hashCode());
        return result;
    }

    public String toString() {
        return "TeamPlanChangeEvent(type=" + this.getType() + ", plan=" + this.getPlan() + ", canAddUra=" + this.isCanAddUra() + ", paidFeatures=" + this.getPaidFeatures() + ")";
    }
}