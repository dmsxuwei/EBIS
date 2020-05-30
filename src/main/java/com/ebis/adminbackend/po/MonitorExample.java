package com.ebis.adminbackend.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MonitorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MonitorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMonitoridIsNull() {
            addCriterion("monitorid is null");
            return (Criteria) this;
        }

        public Criteria andMonitoridIsNotNull() {
            addCriterion("monitorid is not null");
            return (Criteria) this;
        }

        public Criteria andMonitoridEqualTo(String value) {
            addCriterion("monitorid =", value, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridNotEqualTo(String value) {
            addCriterion("monitorid <>", value, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridGreaterThan(String value) {
            addCriterion("monitorid >", value, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridGreaterThanOrEqualTo(String value) {
            addCriterion("monitorid >=", value, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridLessThan(String value) {
            addCriterion("monitorid <", value, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridLessThanOrEqualTo(String value) {
            addCriterion("monitorid <=", value, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridLike(String value) {
            addCriterion("monitorid like", value, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridNotLike(String value) {
            addCriterion("monitorid not like", value, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridIn(List<String> values) {
            addCriterion("monitorid in", values, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridNotIn(List<String> values) {
            addCriterion("monitorid not in", values, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridBetween(String value1, String value2) {
            addCriterion("monitorid between", value1, value2, "monitorid");
            return (Criteria) this;
        }

        public Criteria andMonitoridNotBetween(String value1, String value2) {
            addCriterion("monitorid not between", value1, value2, "monitorid");
            return (Criteria) this;
        }

        public Criteria andEventtypeIsNull() {
            addCriterion("eventtype is null");
            return (Criteria) this;
        }

        public Criteria andEventtypeIsNotNull() {
            addCriterion("eventtype is not null");
            return (Criteria) this;
        }

        public Criteria andEventtypeEqualTo(String value) {
            addCriterion("eventtype =", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeNotEqualTo(String value) {
            addCriterion("eventtype <>", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeGreaterThan(String value) {
            addCriterion("eventtype >", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeGreaterThanOrEqualTo(String value) {
            addCriterion("eventtype >=", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeLessThan(String value) {
            addCriterion("eventtype <", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeLessThanOrEqualTo(String value) {
            addCriterion("eventtype <=", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeLike(String value) {
            addCriterion("eventtype like", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeNotLike(String value) {
            addCriterion("eventtype not like", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeIn(List<String> values) {
            addCriterion("eventtype in", values, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeNotIn(List<String> values) {
            addCriterion("eventtype not in", values, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeBetween(String value1, String value2) {
            addCriterion("eventtype between", value1, value2, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeNotBetween(String value1, String value2) {
            addCriterion("eventtype not between", value1, value2, "eventtype");
            return (Criteria) this;
        }

        public Criteria andIsregisterIsNull() {
            addCriterion("isregister is null");
            return (Criteria) this;
        }

        public Criteria andIsregisterIsNotNull() {
            addCriterion("isregister is not null");
            return (Criteria) this;
        }

        public Criteria andIsregisterEqualTo(String value) {
            addCriterion("isregister =", value, "isregister");
            return (Criteria) this;
        }

        public Criteria andIsregisterNotEqualTo(String value) {
            addCriterion("isregister <>", value, "isregister");
            return (Criteria) this;
        }

        public Criteria andIsregisterGreaterThan(String value) {
            addCriterion("isregister >", value, "isregister");
            return (Criteria) this;
        }

        public Criteria andIsregisterGreaterThanOrEqualTo(String value) {
            addCriterion("isregister >=", value, "isregister");
            return (Criteria) this;
        }

        public Criteria andIsregisterLessThan(String value) {
            addCriterion("isregister <", value, "isregister");
            return (Criteria) this;
        }

        public Criteria andIsregisterLessThanOrEqualTo(String value) {
            addCriterion("isregister <=", value, "isregister");
            return (Criteria) this;
        }

        public Criteria andIsregisterLike(String value) {
            addCriterion("isregister like", value, "isregister");
            return (Criteria) this;
        }

        public Criteria andIsregisterNotLike(String value) {
            addCriterion("isregister not like", value, "isregister");
            return (Criteria) this;
        }

        public Criteria andIsregisterIn(List<String> values) {
            addCriterion("isregister in", values, "isregister");
            return (Criteria) this;
        }

        public Criteria andIsregisterNotIn(List<String> values) {
            addCriterion("isregister not in", values, "isregister");
            return (Criteria) this;
        }

        public Criteria andIsregisterBetween(String value1, String value2) {
            addCriterion("isregister between", value1, value2, "isregister");
            return (Criteria) this;
        }

        public Criteria andIsregisterNotBetween(String value1, String value2) {
            addCriterion("isregister not between", value1, value2, "isregister");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andIpadressIsNull() {
            addCriterion("ipadress is null");
            return (Criteria) this;
        }

        public Criteria andIpadressIsNotNull() {
            addCriterion("ipadress is not null");
            return (Criteria) this;
        }

        public Criteria andIpadressEqualTo(String value) {
            addCriterion("ipadress =", value, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressNotEqualTo(String value) {
            addCriterion("ipadress <>", value, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressGreaterThan(String value) {
            addCriterion("ipadress >", value, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressGreaterThanOrEqualTo(String value) {
            addCriterion("ipadress >=", value, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressLessThan(String value) {
            addCriterion("ipadress <", value, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressLessThanOrEqualTo(String value) {
            addCriterion("ipadress <=", value, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressLike(String value) {
            addCriterion("ipadress like", value, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressNotLike(String value) {
            addCriterion("ipadress not like", value, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressIn(List<String> values) {
            addCriterion("ipadress in", values, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressNotIn(List<String> values) {
            addCriterion("ipadress not in", values, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressBetween(String value1, String value2) {
            addCriterion("ipadress between", value1, value2, "ipadress");
            return (Criteria) this;
        }

        public Criteria andIpadressNotBetween(String value1, String value2) {
            addCriterion("ipadress not between", value1, value2, "ipadress");
            return (Criteria) this;
        }

        public Criteria andEventtimeIsNull() {
            addCriterion("eventtime is null");
            return (Criteria) this;
        }

        public Criteria andEventtimeIsNotNull() {
            addCriterion("eventtime is not null");
            return (Criteria) this;
        }

        public Criteria andEventtimeEqualTo(Date value) {
            addCriterion("eventtime =", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeNotEqualTo(Date value) {
            addCriterion("eventtime <>", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeGreaterThan(Date value) {
            addCriterion("eventtime >", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("eventtime >=", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeLessThan(Date value) {
            addCriterion("eventtime <", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeLessThanOrEqualTo(Date value) {
            addCriterion("eventtime <=", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeIn(List<Date> values) {
            addCriterion("eventtime in", values, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeNotIn(List<Date> values) {
            addCriterion("eventtime not in", values, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeBetween(Date value1, Date value2) {
            addCriterion("eventtime between", value1, value2, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeNotBetween(Date value1, Date value2) {
            addCriterion("eventtime not between", value1, value2, "eventtime");
            return (Criteria) this;
        }

        public Criteria andAdvertisingidIsNull() {
            addCriterion("advertisingid is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingidIsNotNull() {
            addCriterion("advertisingid is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingidEqualTo(String value) {
            addCriterion("advertisingid =", value, "advertisingid");
            return (Criteria) this;
        }

        public Criteria andAdvertisingidNotEqualTo(String value) {
            addCriterion("advertisingid <>", value, "advertisingid");
            return (Criteria) this;
        }

        public Criteria andAdvertisingidGreaterThan(String value) {
            addCriterion("advertisingid >", value, "advertisingid");
            return (Criteria) this;
        }

        public Criteria andAdvertisingidGreaterThanOrEqualTo(String value) {
            addCriterion("advertisingid >=", value, "advertisingid");
            return (Criteria) this;
        }

        public Criteria andAdvertisingidLessThan(String value) {
            addCriterion("advertisingid <", value, "advertisingid");
            return (Criteria) this;
        }

        public Criteria andAdvertisingidLessThanOrEqualTo(String value) {
            addCriterion("advertisingid <=", value, "advertisingid");
            return (Criteria) this;
        }

        public Criteria andAdvertisingidLike(String value) {
            addCriterion("advertisingid like", value, "advertisingid");
            return (Criteria) this;
        }

        public Criteria andAdvertisingidNotLike(String value) {
            addCriterion("advertisingid not like", value, "advertisingid");
            return (Criteria) this;
        }

        public Criteria andAdvertisingidIn(List<String> values) {
            addCriterion("advertisingid in", values, "advertisingid");
            return (Criteria) this;
        }

        public Criteria andAdvertisingidNotIn(List<String> values) {
            addCriterion("advertisingid not in", values, "advertisingid");
            return (Criteria) this;
        }

        public Criteria andAdvertisingidBetween(String value1, String value2) {
            addCriterion("advertisingid between", value1, value2, "advertisingid");
            return (Criteria) this;
        }

        public Criteria andAdvertisingidNotBetween(String value1, String value2) {
            addCriterion("advertisingid not between", value1, value2, "advertisingid");
            return (Criteria) this;
        }

        public Criteria andMerchantidIsNull() {
            addCriterion("merchantid is null");
            return (Criteria) this;
        }

        public Criteria andMerchantidIsNotNull() {
            addCriterion("merchantid is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantidEqualTo(String value) {
            addCriterion("merchantid =", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotEqualTo(String value) {
            addCriterion("merchantid <>", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidGreaterThan(String value) {
            addCriterion("merchantid >", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidGreaterThanOrEqualTo(String value) {
            addCriterion("merchantid >=", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidLessThan(String value) {
            addCriterion("merchantid <", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidLessThanOrEqualTo(String value) {
            addCriterion("merchantid <=", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidLike(String value) {
            addCriterion("merchantid like", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotLike(String value) {
            addCriterion("merchantid not like", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidIn(List<String> values) {
            addCriterion("merchantid in", values, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotIn(List<String> values) {
            addCriterion("merchantid not in", values, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidBetween(String value1, String value2) {
            addCriterion("merchantid between", value1, value2, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotBetween(String value1, String value2) {
            addCriterion("merchantid not between", value1, value2, "merchantid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}