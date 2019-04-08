package com.cqwu.graduation.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatchExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andNumberNowIsNull() {
            addCriterion("number_now is null");
            return (Criteria) this;
        }

        public Criteria andNumberNowIsNotNull() {
            addCriterion("number_now is not null");
            return (Criteria) this;
        }

        public Criteria andNumberNowEqualTo(Integer value) {
            addCriterion("number_now =", value, "numberNow");
            return (Criteria) this;
        }

        public Criteria andNumberNowNotEqualTo(Integer value) {
            addCriterion("number_now <>", value, "numberNow");
            return (Criteria) this;
        }

        public Criteria andNumberNowGreaterThan(Integer value) {
            addCriterion("number_now >", value, "numberNow");
            return (Criteria) this;
        }

        public Criteria andNumberNowGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_now >=", value, "numberNow");
            return (Criteria) this;
        }

        public Criteria andNumberNowLessThan(Integer value) {
            addCriterion("number_now <", value, "numberNow");
            return (Criteria) this;
        }

        public Criteria andNumberNowLessThanOrEqualTo(Integer value) {
            addCriterion("number_now <=", value, "numberNow");
            return (Criteria) this;
        }

        public Criteria andNumberNowIn(List<Integer> values) {
            addCriterion("number_now in", values, "numberNow");
            return (Criteria) this;
        }

        public Criteria andNumberNowNotIn(List<Integer> values) {
            addCriterion("number_now not in", values, "numberNow");
            return (Criteria) this;
        }

        public Criteria andNumberNowBetween(Integer value1, Integer value2) {
            addCriterion("number_now between", value1, value2, "numberNow");
            return (Criteria) this;
        }

        public Criteria andNumberNowNotBetween(Integer value1, Integer value2) {
            addCriterion("number_now not between", value1, value2, "numberNow");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andOrganizerIsNull() {
            addCriterion("organizer is null");
            return (Criteria) this;
        }

        public Criteria andOrganizerIsNotNull() {
            addCriterion("organizer is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizerEqualTo(String value) {
            addCriterion("organizer =", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerNotEqualTo(String value) {
            addCriterion("organizer <>", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerGreaterThan(String value) {
            addCriterion("organizer >", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerGreaterThanOrEqualTo(String value) {
            addCriterion("organizer >=", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerLessThan(String value) {
            addCriterion("organizer <", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerLessThanOrEqualTo(String value) {
            addCriterion("organizer <=", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerLike(String value) {
            addCriterion("organizer like", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerNotLike(String value) {
            addCriterion("organizer not like", value, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerIn(List<String> values) {
            addCriterion("organizer in", values, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerNotIn(List<String> values) {
            addCriterion("organizer not in", values, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerBetween(String value1, String value2) {
            addCriterion("organizer between", value1, value2, "organizer");
            return (Criteria) this;
        }

        public Criteria andOrganizerNotBetween(String value1, String value2) {
            addCriterion("organizer not between", value1, value2, "organizer");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeStartIsNull() {
            addCriterion("subject_time_start is null");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeStartIsNotNull() {
            addCriterion("subject_time_start is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeStartEqualTo(Date value) {
            addCriterion("subject_time_start =", value, "subjectTimeStart");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeStartNotEqualTo(Date value) {
            addCriterion("subject_time_start <>", value, "subjectTimeStart");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeStartGreaterThan(Date value) {
            addCriterion("subject_time_start >", value, "subjectTimeStart");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeStartGreaterThanOrEqualTo(Date value) {
            addCriterion("subject_time_start >=", value, "subjectTimeStart");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeStartLessThan(Date value) {
            addCriterion("subject_time_start <", value, "subjectTimeStart");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeStartLessThanOrEqualTo(Date value) {
            addCriterion("subject_time_start <=", value, "subjectTimeStart");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeStartIn(List<Date> values) {
            addCriterion("subject_time_start in", values, "subjectTimeStart");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeStartNotIn(List<Date> values) {
            addCriterion("subject_time_start not in", values, "subjectTimeStart");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeStartBetween(Date value1, Date value2) {
            addCriterion("subject_time_start between", value1, value2, "subjectTimeStart");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeStartNotBetween(Date value1, Date value2) {
            addCriterion("subject_time_start not between", value1, value2, "subjectTimeStart");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeEndIsNull() {
            addCriterion("subject_time_end is null");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeEndIsNotNull() {
            addCriterion("subject_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeEndEqualTo(Date value) {
            addCriterion("subject_time_end =", value, "subjectTimeEnd");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeEndNotEqualTo(Date value) {
            addCriterion("subject_time_end <>", value, "subjectTimeEnd");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeEndGreaterThan(Date value) {
            addCriterion("subject_time_end >", value, "subjectTimeEnd");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeEndGreaterThanOrEqualTo(Date value) {
            addCriterion("subject_time_end >=", value, "subjectTimeEnd");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeEndLessThan(Date value) {
            addCriterion("subject_time_end <", value, "subjectTimeEnd");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeEndLessThanOrEqualTo(Date value) {
            addCriterion("subject_time_end <=", value, "subjectTimeEnd");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeEndIn(List<Date> values) {
            addCriterion("subject_time_end in", values, "subjectTimeEnd");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeEndNotIn(List<Date> values) {
            addCriterion("subject_time_end not in", values, "subjectTimeEnd");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeEndBetween(Date value1, Date value2) {
            addCriterion("subject_time_end between", value1, value2, "subjectTimeEnd");
            return (Criteria) this;
        }

        public Criteria andSubjectTimeEndNotBetween(Date value1, Date value2) {
            addCriterion("subject_time_end not between", value1, value2, "subjectTimeEnd");
            return (Criteria) this;
        }

        public Criteria andMatchTimeStartIsNull() {
            addCriterion("match_time_start is null");
            return (Criteria) this;
        }

        public Criteria andMatchTimeStartIsNotNull() {
            addCriterion("match_time_start is not null");
            return (Criteria) this;
        }

        public Criteria andMatchTimeStartEqualTo(Date value) {
            addCriterion("match_time_start =", value, "matchTimeStart");
            return (Criteria) this;
        }

        public Criteria andMatchTimeStartNotEqualTo(Date value) {
            addCriterion("match_time_start <>", value, "matchTimeStart");
            return (Criteria) this;
        }

        public Criteria andMatchTimeStartGreaterThan(Date value) {
            addCriterion("match_time_start >", value, "matchTimeStart");
            return (Criteria) this;
        }

        public Criteria andMatchTimeStartGreaterThanOrEqualTo(Date value) {
            addCriterion("match_time_start >=", value, "matchTimeStart");
            return (Criteria) this;
        }

        public Criteria andMatchTimeStartLessThan(Date value) {
            addCriterion("match_time_start <", value, "matchTimeStart");
            return (Criteria) this;
        }

        public Criteria andMatchTimeStartLessThanOrEqualTo(Date value) {
            addCriterion("match_time_start <=", value, "matchTimeStart");
            return (Criteria) this;
        }

        public Criteria andMatchTimeStartIn(List<Date> values) {
            addCriterion("match_time_start in", values, "matchTimeStart");
            return (Criteria) this;
        }

        public Criteria andMatchTimeStartNotIn(List<Date> values) {
            addCriterion("match_time_start not in", values, "matchTimeStart");
            return (Criteria) this;
        }

        public Criteria andMatchTimeStartBetween(Date value1, Date value2) {
            addCriterion("match_time_start between", value1, value2, "matchTimeStart");
            return (Criteria) this;
        }

        public Criteria andMatchTimeStartNotBetween(Date value1, Date value2) {
            addCriterion("match_time_start not between", value1, value2, "matchTimeStart");
            return (Criteria) this;
        }

        public Criteria andMatchTimeEndIsNull() {
            addCriterion("match_time_end is null");
            return (Criteria) this;
        }

        public Criteria andMatchTimeEndIsNotNull() {
            addCriterion("match_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andMatchTimeEndEqualTo(Date value) {
            addCriterion("match_time_end =", value, "matchTimeEnd");
            return (Criteria) this;
        }

        public Criteria andMatchTimeEndNotEqualTo(Date value) {
            addCriterion("match_time_end <>", value, "matchTimeEnd");
            return (Criteria) this;
        }

        public Criteria andMatchTimeEndGreaterThan(Date value) {
            addCriterion("match_time_end >", value, "matchTimeEnd");
            return (Criteria) this;
        }

        public Criteria andMatchTimeEndGreaterThanOrEqualTo(Date value) {
            addCriterion("match_time_end >=", value, "matchTimeEnd");
            return (Criteria) this;
        }

        public Criteria andMatchTimeEndLessThan(Date value) {
            addCriterion("match_time_end <", value, "matchTimeEnd");
            return (Criteria) this;
        }

        public Criteria andMatchTimeEndLessThanOrEqualTo(Date value) {
            addCriterion("match_time_end <=", value, "matchTimeEnd");
            return (Criteria) this;
        }

        public Criteria andMatchTimeEndIn(List<Date> values) {
            addCriterion("match_time_end in", values, "matchTimeEnd");
            return (Criteria) this;
        }

        public Criteria andMatchTimeEndNotIn(List<Date> values) {
            addCriterion("match_time_end not in", values, "matchTimeEnd");
            return (Criteria) this;
        }

        public Criteria andMatchTimeEndBetween(Date value1, Date value2) {
            addCriterion("match_time_end between", value1, value2, "matchTimeEnd");
            return (Criteria) this;
        }

        public Criteria andMatchTimeEndNotBetween(Date value1, Date value2) {
            addCriterion("match_time_end not between", value1, value2, "matchTimeEnd");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeIsNull() {
            addCriterion("raw_add_time is null");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeIsNotNull() {
            addCriterion("raw_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeEqualTo(Date value) {
            addCriterion("raw_add_time =", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeNotEqualTo(Date value) {
            addCriterion("raw_add_time <>", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeGreaterThan(Date value) {
            addCriterion("raw_add_time >", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("raw_add_time >=", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeLessThan(Date value) {
            addCriterion("raw_add_time <", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("raw_add_time <=", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeIn(List<Date> values) {
            addCriterion("raw_add_time in", values, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeNotIn(List<Date> values) {
            addCriterion("raw_add_time not in", values, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeBetween(Date value1, Date value2) {
            addCriterion("raw_add_time between", value1, value2, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("raw_add_time not between", value1, value2, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeIsNull() {
            addCriterion("raw_update_time is null");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeIsNotNull() {
            addCriterion("raw_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeEqualTo(Date value) {
            addCriterion("raw_update_time =", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeNotEqualTo(Date value) {
            addCriterion("raw_update_time <>", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeGreaterThan(Date value) {
            addCriterion("raw_update_time >", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("raw_update_time >=", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeLessThan(Date value) {
            addCriterion("raw_update_time <", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("raw_update_time <=", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeIn(List<Date> values) {
            addCriterion("raw_update_time in", values, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeNotIn(List<Date> values) {
            addCriterion("raw_update_time not in", values, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("raw_update_time between", value1, value2, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("raw_update_time not between", value1, value2, "rawUpdateTime");
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