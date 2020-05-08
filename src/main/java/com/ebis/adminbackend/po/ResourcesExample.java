package com.ebis.adminbackend.po;

import java.util.ArrayList;
import java.util.List;

public class ResourcesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourcesExample() {
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

        public Criteria andResourceidIsNull() {
            addCriterion("resourceid is null");
            return (Criteria) this;
        }

        public Criteria andResourceidIsNotNull() {
            addCriterion("resourceid is not null");
            return (Criteria) this;
        }

        public Criteria andResourceidEqualTo(String value) {
            addCriterion("resourceid =", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidNotEqualTo(String value) {
            addCriterion("resourceid <>", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidGreaterThan(String value) {
            addCriterion("resourceid >", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidGreaterThanOrEqualTo(String value) {
            addCriterion("resourceid >=", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidLessThan(String value) {
            addCriterion("resourceid <", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidLessThanOrEqualTo(String value) {
            addCriterion("resourceid <=", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidLike(String value) {
            addCriterion("resourceid like", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidNotLike(String value) {
            addCriterion("resourceid not like", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidIn(List<String> values) {
            addCriterion("resourceid in", values, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidNotIn(List<String> values) {
            addCriterion("resourceid not in", values, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidBetween(String value1, String value2) {
            addCriterion("resourceid between", value1, value2, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidNotBetween(String value1, String value2) {
            addCriterion("resourceid not between", value1, value2, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourcenameIsNull() {
            addCriterion("resourcename is null");
            return (Criteria) this;
        }

        public Criteria andResourcenameIsNotNull() {
            addCriterion("resourcename is not null");
            return (Criteria) this;
        }

        public Criteria andResourcenameEqualTo(String value) {
            addCriterion("resourcename =", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameNotEqualTo(String value) {
            addCriterion("resourcename <>", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameGreaterThan(String value) {
            addCriterion("resourcename >", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameGreaterThanOrEqualTo(String value) {
            addCriterion("resourcename >=", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameLessThan(String value) {
            addCriterion("resourcename <", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameLessThanOrEqualTo(String value) {
            addCriterion("resourcename <=", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameLike(String value) {
            addCriterion("resourcename like", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameNotLike(String value) {
            addCriterion("resourcename not like", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameIn(List<String> values) {
            addCriterion("resourcename in", values, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameNotIn(List<String> values) {
            addCriterion("resourcename not in", values, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameBetween(String value1, String value2) {
            addCriterion("resourcename between", value1, value2, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameNotBetween(String value1, String value2) {
            addCriterion("resourcename not between", value1, value2, "resourcename");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("addr is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("addr is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("addr =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("addr <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("addr >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("addr >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("addr <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("addr <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("addr like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("addr not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("addr in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("addr not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("addr between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("addr not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("parentid like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("parentid not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("parentid not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andIsendIsNull() {
            addCriterion("isend is null");
            return (Criteria) this;
        }

        public Criteria andIsendIsNotNull() {
            addCriterion("isend is not null");
            return (Criteria) this;
        }

        public Criteria andIsendEqualTo(Integer value) {
            addCriterion("isend =", value, "isend");
            return (Criteria) this;
        }

        public Criteria andIsendNotEqualTo(Integer value) {
            addCriterion("isend <>", value, "isend");
            return (Criteria) this;
        }

        public Criteria andIsendGreaterThan(Integer value) {
            addCriterion("isend >", value, "isend");
            return (Criteria) this;
        }

        public Criteria andIsendGreaterThanOrEqualTo(Integer value) {
            addCriterion("isend >=", value, "isend");
            return (Criteria) this;
        }

        public Criteria andIsendLessThan(Integer value) {
            addCriterion("isend <", value, "isend");
            return (Criteria) this;
        }

        public Criteria andIsendLessThanOrEqualTo(Integer value) {
            addCriterion("isend <=", value, "isend");
            return (Criteria) this;
        }

        public Criteria andIsendIn(List<Integer> values) {
            addCriterion("isend in", values, "isend");
            return (Criteria) this;
        }

        public Criteria andIsendNotIn(List<Integer> values) {
            addCriterion("isend not in", values, "isend");
            return (Criteria) this;
        }

        public Criteria andIsendBetween(Integer value1, Integer value2) {
            addCriterion("isend between", value1, value2, "isend");
            return (Criteria) this;
        }

        public Criteria andIsendNotBetween(Integer value1, Integer value2) {
            addCriterion("isend not between", value1, value2, "isend");
            return (Criteria) this;
        }

        public Criteria andCatagoryIsNull() {
            addCriterion("catagory is null");
            return (Criteria) this;
        }

        public Criteria andCatagoryIsNotNull() {
            addCriterion("catagory is not null");
            return (Criteria) this;
        }

        public Criteria andCatagoryEqualTo(Integer value) {
            addCriterion("catagory =", value, "catagory");
            return (Criteria) this;
        }

        public Criteria andCatagoryNotEqualTo(Integer value) {
            addCriterion("catagory <>", value, "catagory");
            return (Criteria) this;
        }

        public Criteria andCatagoryGreaterThan(Integer value) {
            addCriterion("catagory >", value, "catagory");
            return (Criteria) this;
        }

        public Criteria andCatagoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("catagory >=", value, "catagory");
            return (Criteria) this;
        }

        public Criteria andCatagoryLessThan(Integer value) {
            addCriterion("catagory <", value, "catagory");
            return (Criteria) this;
        }

        public Criteria andCatagoryLessThanOrEqualTo(Integer value) {
            addCriterion("catagory <=", value, "catagory");
            return (Criteria) this;
        }

        public Criteria andCatagoryIn(List<Integer> values) {
            addCriterion("catagory in", values, "catagory");
            return (Criteria) this;
        }

        public Criteria andCatagoryNotIn(List<Integer> values) {
            addCriterion("catagory not in", values, "catagory");
            return (Criteria) this;
        }

        public Criteria andCatagoryBetween(Integer value1, Integer value2) {
            addCriterion("catagory between", value1, value2, "catagory");
            return (Criteria) this;
        }

        public Criteria andCatagoryNotBetween(Integer value1, Integer value2) {
            addCriterion("catagory not between", value1, value2, "catagory");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andIconclsIsNull() {
            addCriterion("iconCls is null");
            return (Criteria) this;
        }

        public Criteria andIconclsIsNotNull() {
            addCriterion("iconCls is not null");
            return (Criteria) this;
        }

        public Criteria andIconclsEqualTo(String value) {
            addCriterion("iconCls =", value, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsNotEqualTo(String value) {
            addCriterion("iconCls <>", value, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsGreaterThan(String value) {
            addCriterion("iconCls >", value, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsGreaterThanOrEqualTo(String value) {
            addCriterion("iconCls >=", value, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsLessThan(String value) {
            addCriterion("iconCls <", value, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsLessThanOrEqualTo(String value) {
            addCriterion("iconCls <=", value, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsLike(String value) {
            addCriterion("iconCls like", value, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsNotLike(String value) {
            addCriterion("iconCls not like", value, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsIn(List<String> values) {
            addCriterion("iconCls in", values, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsNotIn(List<String> values) {
            addCriterion("iconCls not in", values, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsBetween(String value1, String value2) {
            addCriterion("iconCls between", value1, value2, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsNotBetween(String value1, String value2) {
            addCriterion("iconCls not between", value1, value2, "iconcls");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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