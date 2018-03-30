package com.fsc.domain.bo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CustomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomExample() {
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

        public Criteria andCusIdIsNull() {
            addCriterion("CUS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCusIdIsNotNull() {
            addCriterion("CUS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCusIdEqualTo(Integer value) {
            addCriterion("CUS_ID =", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotEqualTo(Integer value) {
            addCriterion("CUS_ID <>", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdGreaterThan(Integer value) {
            addCriterion("CUS_ID >", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUS_ID >=", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdLessThan(Integer value) {
            addCriterion("CUS_ID <", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdLessThanOrEqualTo(Integer value) {
            addCriterion("CUS_ID <=", value, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdIn(List<Integer> values) {
            addCriterion("CUS_ID in", values, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotIn(List<Integer> values) {
            addCriterion("CUS_ID not in", values, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdBetween(Integer value1, Integer value2) {
            addCriterion("CUS_ID between", value1, value2, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CUS_ID not between", value1, value2, "cusId");
            return (Criteria) this;
        }

        public Criteria andCusShortnameIsNull() {
            addCriterion("CUS_SHORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andCusShortnameIsNotNull() {
            addCriterion("CUS_SHORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCusShortnameEqualTo(String value) {
            addCriterion("CUS_SHORTNAME =", value, "cusShortname");
            return (Criteria) this;
        }

        public Criteria andCusShortnameNotEqualTo(String value) {
            addCriterion("CUS_SHORTNAME <>", value, "cusShortname");
            return (Criteria) this;
        }

        public Criteria andCusShortnameGreaterThan(String value) {
            addCriterion("CUS_SHORTNAME >", value, "cusShortname");
            return (Criteria) this;
        }

        public Criteria andCusShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_SHORTNAME >=", value, "cusShortname");
            return (Criteria) this;
        }

        public Criteria andCusShortnameLessThan(String value) {
            addCriterion("CUS_SHORTNAME <", value, "cusShortname");
            return (Criteria) this;
        }

        public Criteria andCusShortnameLessThanOrEqualTo(String value) {
            addCriterion("CUS_SHORTNAME <=", value, "cusShortname");
            return (Criteria) this;
        }

        public Criteria andCusShortnameLike(String value) {
            addCriterion("CUS_SHORTNAME like", value, "cusShortname");
            return (Criteria) this;
        }

        public Criteria andCusShortnameNotLike(String value) {
            addCriterion("CUS_SHORTNAME not like", value, "cusShortname");
            return (Criteria) this;
        }

        public Criteria andCusShortnameIn(List<String> values) {
            addCriterion("CUS_SHORTNAME in", values, "cusShortname");
            return (Criteria) this;
        }

        public Criteria andCusShortnameNotIn(List<String> values) {
            addCriterion("CUS_SHORTNAME not in", values, "cusShortname");
            return (Criteria) this;
        }

        public Criteria andCusShortnameBetween(String value1, String value2) {
            addCriterion("CUS_SHORTNAME between", value1, value2, "cusShortname");
            return (Criteria) this;
        }

        public Criteria andCusShortnameNotBetween(String value1, String value2) {
            addCriterion("CUS_SHORTNAME not between", value1, value2, "cusShortname");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNull() {
            addCriterion("CUS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNotNull() {
            addCriterion("CUS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCusNameEqualTo(String value) {
            addCriterion("CUS_NAME =", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotEqualTo(String value) {
            addCriterion("CUS_NAME <>", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThan(String value) {
            addCriterion("CUS_NAME >", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_NAME >=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThan(String value) {
            addCriterion("CUS_NAME <", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThanOrEqualTo(String value) {
            addCriterion("CUS_NAME <=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLike(String value) {
            addCriterion("CUS_NAME like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotLike(String value) {
            addCriterion("CUS_NAME not like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameIn(List<String> values) {
            addCriterion("CUS_NAME in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotIn(List<String> values) {
            addCriterion("CUS_NAME not in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameBetween(String value1, String value2) {
            addCriterion("CUS_NAME between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotBetween(String value1, String value2) {
            addCriterion("CUS_NAME not between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusTypeIsNull() {
            addCriterion("CUS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCusTypeIsNotNull() {
            addCriterion("CUS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCusTypeEqualTo(String value) {
            addCriterion("CUS_TYPE =", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeNotEqualTo(String value) {
            addCriterion("CUS_TYPE <>", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeGreaterThan(String value) {
            addCriterion("CUS_TYPE >", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_TYPE >=", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeLessThan(String value) {
            addCriterion("CUS_TYPE <", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeLessThanOrEqualTo(String value) {
            addCriterion("CUS_TYPE <=", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeLike(String value) {
            addCriterion("CUS_TYPE like", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeNotLike(String value) {
            addCriterion("CUS_TYPE not like", value, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeIn(List<String> values) {
            addCriterion("CUS_TYPE in", values, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeNotIn(List<String> values) {
            addCriterion("CUS_TYPE not in", values, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeBetween(String value1, String value2) {
            addCriterion("CUS_TYPE between", value1, value2, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusTypeNotBetween(String value1, String value2) {
            addCriterion("CUS_TYPE not between", value1, value2, "cusType");
            return (Criteria) this;
        }

        public Criteria andCusContactIsNull() {
            addCriterion("CUS_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andCusContactIsNotNull() {
            addCriterion("CUS_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andCusContactEqualTo(String value) {
            addCriterion("CUS_CONTACT =", value, "cusContact");
            return (Criteria) this;
        }

        public Criteria andCusContactNotEqualTo(String value) {
            addCriterion("CUS_CONTACT <>", value, "cusContact");
            return (Criteria) this;
        }

        public Criteria andCusContactGreaterThan(String value) {
            addCriterion("CUS_CONTACT >", value, "cusContact");
            return (Criteria) this;
        }

        public Criteria andCusContactGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_CONTACT >=", value, "cusContact");
            return (Criteria) this;
        }

        public Criteria andCusContactLessThan(String value) {
            addCriterion("CUS_CONTACT <", value, "cusContact");
            return (Criteria) this;
        }

        public Criteria andCusContactLessThanOrEqualTo(String value) {
            addCriterion("CUS_CONTACT <=", value, "cusContact");
            return (Criteria) this;
        }

        public Criteria andCusContactLike(String value) {
            addCriterion("CUS_CONTACT like", value, "cusContact");
            return (Criteria) this;
        }

        public Criteria andCusContactNotLike(String value) {
            addCriterion("CUS_CONTACT not like", value, "cusContact");
            return (Criteria) this;
        }

        public Criteria andCusContactIn(List<String> values) {
            addCriterion("CUS_CONTACT in", values, "cusContact");
            return (Criteria) this;
        }

        public Criteria andCusContactNotIn(List<String> values) {
            addCriterion("CUS_CONTACT not in", values, "cusContact");
            return (Criteria) this;
        }

        public Criteria andCusContactBetween(String value1, String value2) {
            addCriterion("CUS_CONTACT between", value1, value2, "cusContact");
            return (Criteria) this;
        }

        public Criteria andCusContactNotBetween(String value1, String value2) {
            addCriterion("CUS_CONTACT not between", value1, value2, "cusContact");
            return (Criteria) this;
        }

        public Criteria andCusCreattimeIsNull() {
            addCriterion("CUS_CREATTIME is null");
            return (Criteria) this;
        }

        public Criteria andCusCreattimeIsNotNull() {
            addCriterion("CUS_CREATTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCusCreattimeEqualTo(String value) {
            addCriterion("CUS_CREATTIME =", value, "cusCreattime");
            return (Criteria) this;
        }

        public Criteria andCusCreattimeNotEqualTo(String value) {
            addCriterion("CUS_CREATTIME <>", value, "cusCreattime");
            return (Criteria) this;
        }

        public Criteria andCusCreattimeGreaterThan(String value) {
            addCriterion("CUS_CREATTIME >", value, "cusCreattime");
            return (Criteria) this;
        }

        public Criteria andCusCreattimeGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_CREATTIME >=", value, "cusCreattime");
            return (Criteria) this;
        }

        public Criteria andCusCreattimeLessThan(String value) {
            addCriterion("CUS_CREATTIME <", value, "cusCreattime");
            return (Criteria) this;
        }

        public Criteria andCusCreattimeLessThanOrEqualTo(String value) {
            addCriterion("CUS_CREATTIME <=", value, "cusCreattime");
            return (Criteria) this;
        }

        public Criteria andCusCreattimeLike(String value) {
            addCriterion("CUS_CREATTIME like", value, "cusCreattime");
            return (Criteria) this;
        }

        public Criteria andCusCreattimeNotLike(String value) {
            addCriterion("CUS_CREATTIME not like", value, "cusCreattime");
            return (Criteria) this;
        }

        public Criteria andCusCreattimeIn(List<String> values) {
            addCriterion("CUS_CREATTIME in", values, "cusCreattime");
            return (Criteria) this;
        }

        public Criteria andCusCreattimeNotIn(List<String> values) {
            addCriterion("CUS_CREATTIME not in", values, "cusCreattime");
            return (Criteria) this;
        }

        public Criteria andCusCreattimeBetween(String value1, String value2) {
            addCriterion("CUS_CREATTIME between", value1, value2, "cusCreattime");
            return (Criteria) this;
        }

        public Criteria andCusCreattimeNotBetween(String value1, String value2) {
            addCriterion("CUS_CREATTIME not between", value1, value2, "cusCreattime");
            return (Criteria) this;
        }

        public Criteria andCusPriceIsNull() {
            addCriterion("CUS_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCusPriceIsNotNull() {
            addCriterion("CUS_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCusPriceEqualTo(BigDecimal value) {
            addCriterion("CUS_PRICE =", value, "cusPrice");
            return (Criteria) this;
        }

        public Criteria andCusPriceNotEqualTo(BigDecimal value) {
            addCriterion("CUS_PRICE <>", value, "cusPrice");
            return (Criteria) this;
        }

        public Criteria andCusPriceGreaterThan(BigDecimal value) {
            addCriterion("CUS_PRICE >", value, "cusPrice");
            return (Criteria) this;
        }

        public Criteria andCusPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CUS_PRICE >=", value, "cusPrice");
            return (Criteria) this;
        }

        public Criteria andCusPriceLessThan(BigDecimal value) {
            addCriterion("CUS_PRICE <", value, "cusPrice");
            return (Criteria) this;
        }

        public Criteria andCusPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CUS_PRICE <=", value, "cusPrice");
            return (Criteria) this;
        }

        public Criteria andCusPriceIn(List<BigDecimal> values) {
            addCriterion("CUS_PRICE in", values, "cusPrice");
            return (Criteria) this;
        }

        public Criteria andCusPriceNotIn(List<BigDecimal> values) {
            addCriterion("CUS_PRICE not in", values, "cusPrice");
            return (Criteria) this;
        }

        public Criteria andCusPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUS_PRICE between", value1, value2, "cusPrice");
            return (Criteria) this;
        }

        public Criteria andCusPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUS_PRICE not between", value1, value2, "cusPrice");
            return (Criteria) this;
        }

        public Criteria andCusSignIsNull() {
            addCriterion("CUS_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andCusSignIsNotNull() {
            addCriterion("CUS_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andCusSignEqualTo(String value) {
            addCriterion("CUS_SIGN =", value, "cusSign");
            return (Criteria) this;
        }

        public Criteria andCusSignNotEqualTo(String value) {
            addCriterion("CUS_SIGN <>", value, "cusSign");
            return (Criteria) this;
        }

        public Criteria andCusSignGreaterThan(String value) {
            addCriterion("CUS_SIGN >", value, "cusSign");
            return (Criteria) this;
        }

        public Criteria andCusSignGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_SIGN >=", value, "cusSign");
            return (Criteria) this;
        }

        public Criteria andCusSignLessThan(String value) {
            addCriterion("CUS_SIGN <", value, "cusSign");
            return (Criteria) this;
        }

        public Criteria andCusSignLessThanOrEqualTo(String value) {
            addCriterion("CUS_SIGN <=", value, "cusSign");
            return (Criteria) this;
        }

        public Criteria andCusSignLike(String value) {
            addCriterion("CUS_SIGN like", value, "cusSign");
            return (Criteria) this;
        }

        public Criteria andCusSignNotLike(String value) {
            addCriterion("CUS_SIGN not like", value, "cusSign");
            return (Criteria) this;
        }

        public Criteria andCusSignIn(List<String> values) {
            addCriterion("CUS_SIGN in", values, "cusSign");
            return (Criteria) this;
        }

        public Criteria andCusSignNotIn(List<String> values) {
            addCriterion("CUS_SIGN not in", values, "cusSign");
            return (Criteria) this;
        }

        public Criteria andCusSignBetween(String value1, String value2) {
            addCriterion("CUS_SIGN between", value1, value2, "cusSign");
            return (Criteria) this;
        }

        public Criteria andCusSignNotBetween(String value1, String value2) {
            addCriterion("CUS_SIGN not between", value1, value2, "cusSign");
            return (Criteria) this;
        }

        public Criteria andCusServiceIsNull() {
            addCriterion("CUS_SERVICE is null");
            return (Criteria) this;
        }

        public Criteria andCusServiceIsNotNull() {
            addCriterion("CUS_SERVICE is not null");
            return (Criteria) this;
        }

        public Criteria andCusServiceEqualTo(String value) {
            addCriterion("CUS_SERVICE =", value, "cusService");
            return (Criteria) this;
        }

        public Criteria andCusServiceNotEqualTo(String value) {
            addCriterion("CUS_SERVICE <>", value, "cusService");
            return (Criteria) this;
        }

        public Criteria andCusServiceGreaterThan(String value) {
            addCriterion("CUS_SERVICE >", value, "cusService");
            return (Criteria) this;
        }

        public Criteria andCusServiceGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_SERVICE >=", value, "cusService");
            return (Criteria) this;
        }

        public Criteria andCusServiceLessThan(String value) {
            addCriterion("CUS_SERVICE <", value, "cusService");
            return (Criteria) this;
        }

        public Criteria andCusServiceLessThanOrEqualTo(String value) {
            addCriterion("CUS_SERVICE <=", value, "cusService");
            return (Criteria) this;
        }

        public Criteria andCusServiceLike(String value) {
            addCriterion("CUS_SERVICE like", value, "cusService");
            return (Criteria) this;
        }

        public Criteria andCusServiceNotLike(String value) {
            addCriterion("CUS_SERVICE not like", value, "cusService");
            return (Criteria) this;
        }

        public Criteria andCusServiceIn(List<String> values) {
            addCriterion("CUS_SERVICE in", values, "cusService");
            return (Criteria) this;
        }

        public Criteria andCusServiceNotIn(List<String> values) {
            addCriterion("CUS_SERVICE not in", values, "cusService");
            return (Criteria) this;
        }

        public Criteria andCusServiceBetween(String value1, String value2) {
            addCriterion("CUS_SERVICE between", value1, value2, "cusService");
            return (Criteria) this;
        }

        public Criteria andCusServiceNotBetween(String value1, String value2) {
            addCriterion("CUS_SERVICE not between", value1, value2, "cusService");
            return (Criteria) this;
        }

        public Criteria andCusCreatmanIsNull() {
            addCriterion("CUS_CREATMAN is null");
            return (Criteria) this;
        }

        public Criteria andCusCreatmanIsNotNull() {
            addCriterion("CUS_CREATMAN is not null");
            return (Criteria) this;
        }

        public Criteria andCusCreatmanEqualTo(String value) {
            addCriterion("CUS_CREATMAN =", value, "cusCreatman");
            return (Criteria) this;
        }

        public Criteria andCusCreatmanNotEqualTo(String value) {
            addCriterion("CUS_CREATMAN <>", value, "cusCreatman");
            return (Criteria) this;
        }

        public Criteria andCusCreatmanGreaterThan(String value) {
            addCriterion("CUS_CREATMAN >", value, "cusCreatman");
            return (Criteria) this;
        }

        public Criteria andCusCreatmanGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_CREATMAN >=", value, "cusCreatman");
            return (Criteria) this;
        }

        public Criteria andCusCreatmanLessThan(String value) {
            addCriterion("CUS_CREATMAN <", value, "cusCreatman");
            return (Criteria) this;
        }

        public Criteria andCusCreatmanLessThanOrEqualTo(String value) {
            addCriterion("CUS_CREATMAN <=", value, "cusCreatman");
            return (Criteria) this;
        }

        public Criteria andCusCreatmanLike(String value) {
            addCriterion("CUS_CREATMAN like", value, "cusCreatman");
            return (Criteria) this;
        }

        public Criteria andCusCreatmanNotLike(String value) {
            addCriterion("CUS_CREATMAN not like", value, "cusCreatman");
            return (Criteria) this;
        }

        public Criteria andCusCreatmanIn(List<String> values) {
            addCriterion("CUS_CREATMAN in", values, "cusCreatman");
            return (Criteria) this;
        }

        public Criteria andCusCreatmanNotIn(List<String> values) {
            addCriterion("CUS_CREATMAN not in", values, "cusCreatman");
            return (Criteria) this;
        }

        public Criteria andCusCreatmanBetween(String value1, String value2) {
            addCriterion("CUS_CREATMAN between", value1, value2, "cusCreatman");
            return (Criteria) this;
        }

        public Criteria andCusCreatmanNotBetween(String value1, String value2) {
            addCriterion("CUS_CREATMAN not between", value1, value2, "cusCreatman");
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