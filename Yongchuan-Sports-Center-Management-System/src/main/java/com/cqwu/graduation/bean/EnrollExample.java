package com.cqwu.graduation.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnrollExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnrollExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andEntryMatchIdIsNull() {
            addCriterion("entry_match_id is null");
            return (Criteria) this;
        }

        public Criteria andEntryMatchIdIsNotNull() {
            addCriterion("entry_match_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntryMatchIdEqualTo(Integer value) {
            addCriterion("entry_match_id =", value, "entryMatchId");
            return (Criteria) this;
        }

        public Criteria andEntryMatchIdNotEqualTo(Integer value) {
            addCriterion("entry_match_id <>", value, "entryMatchId");
            return (Criteria) this;
        }

        public Criteria andEntryMatchIdGreaterThan(Integer value) {
            addCriterion("entry_match_id >", value, "entryMatchId");
            return (Criteria) this;
        }

        public Criteria andEntryMatchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("entry_match_id >=", value, "entryMatchId");
            return (Criteria) this;
        }

        public Criteria andEntryMatchIdLessThan(Integer value) {
            addCriterion("entry_match_id <", value, "entryMatchId");
            return (Criteria) this;
        }

        public Criteria andEntryMatchIdLessThanOrEqualTo(Integer value) {
            addCriterion("entry_match_id <=", value, "entryMatchId");
            return (Criteria) this;
        }

        public Criteria andEntryMatchIdIn(List<Integer> values) {
            addCriterion("entry_match_id in", values, "entryMatchId");
            return (Criteria) this;
        }

        public Criteria andEntryMatchIdNotIn(List<Integer> values) {
            addCriterion("entry_match_id not in", values, "entryMatchId");
            return (Criteria) this;
        }

        public Criteria andEntryMatchIdBetween(Integer value1, Integer value2) {
            addCriterion("entry_match_id between", value1, value2, "entryMatchId");
            return (Criteria) this;
        }

        public Criteria andEntryMatchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("entry_match_id not between", value1, value2, "entryMatchId");
            return (Criteria) this;
        }

        public Criteria andMatchStateIsNull() {
            addCriterion("match_state is null");
            return (Criteria) this;
        }

        public Criteria andMatchStateIsNotNull() {
            addCriterion("match_state is not null");
            return (Criteria) this;
        }

        public Criteria andMatchStateEqualTo(String value) {
            addCriterion("match_state =", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateNotEqualTo(String value) {
            addCriterion("match_state <>", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateGreaterThan(String value) {
            addCriterion("match_state >", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateGreaterThanOrEqualTo(String value) {
            addCriterion("match_state >=", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateLessThan(String value) {
            addCriterion("match_state <", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateLessThanOrEqualTo(String value) {
            addCriterion("match_state <=", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateLike(String value) {
            addCriterion("match_state like", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateNotLike(String value) {
            addCriterion("match_state not like", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateIn(List<String> values) {
            addCriterion("match_state in", values, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateNotIn(List<String> values) {
            addCriterion("match_state not in", values, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateBetween(String value1, String value2) {
            addCriterion("match_state between", value1, value2, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateNotBetween(String value1, String value2) {
            addCriterion("match_state not between", value1, value2, "matchState");
            return (Criteria) this;
        }

        public Criteria andEntrySubjectIdIsNull() {
            addCriterion("entry_subject_id is null");
            return (Criteria) this;
        }

        public Criteria andEntrySubjectIdIsNotNull() {
            addCriterion("entry_subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntrySubjectIdEqualTo(Integer value) {
            addCriterion("entry_subject_id =", value, "entrySubjectId");
            return (Criteria) this;
        }

        public Criteria andEntrySubjectIdNotEqualTo(Integer value) {
            addCriterion("entry_subject_id <>", value, "entrySubjectId");
            return (Criteria) this;
        }

        public Criteria andEntrySubjectIdGreaterThan(Integer value) {
            addCriterion("entry_subject_id >", value, "entrySubjectId");
            return (Criteria) this;
        }

        public Criteria andEntrySubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("entry_subject_id >=", value, "entrySubjectId");
            return (Criteria) this;
        }

        public Criteria andEntrySubjectIdLessThan(Integer value) {
            addCriterion("entry_subject_id <", value, "entrySubjectId");
            return (Criteria) this;
        }

        public Criteria andEntrySubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("entry_subject_id <=", value, "entrySubjectId");
            return (Criteria) this;
        }

        public Criteria andEntrySubjectIdIn(List<Integer> values) {
            addCriterion("entry_subject_id in", values, "entrySubjectId");
            return (Criteria) this;
        }

        public Criteria andEntrySubjectIdNotIn(List<Integer> values) {
            addCriterion("entry_subject_id not in", values, "entrySubjectId");
            return (Criteria) this;
        }

        public Criteria andEntrySubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("entry_subject_id between", value1, value2, "entrySubjectId");
            return (Criteria) this;
        }

        public Criteria andEntrySubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("entry_subject_id not between", value1, value2, "entrySubjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectStateIsNull() {
            addCriterion("subject_state is null");
            return (Criteria) this;
        }

        public Criteria andSubjectStateIsNotNull() {
            addCriterion("subject_state is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectStateEqualTo(String value) {
            addCriterion("subject_state =", value, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateNotEqualTo(String value) {
            addCriterion("subject_state <>", value, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateGreaterThan(String value) {
            addCriterion("subject_state >", value, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateGreaterThanOrEqualTo(String value) {
            addCriterion("subject_state >=", value, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateLessThan(String value) {
            addCriterion("subject_state <", value, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateLessThanOrEqualTo(String value) {
            addCriterion("subject_state <=", value, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateLike(String value) {
            addCriterion("subject_state like", value, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateNotLike(String value) {
            addCriterion("subject_state not like", value, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateIn(List<String> values) {
            addCriterion("subject_state in", values, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateNotIn(List<String> values) {
            addCriterion("subject_state not in", values, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateBetween(String value1, String value2) {
            addCriterion("subject_state between", value1, value2, "subjectState");
            return (Criteria) this;
        }

        public Criteria andSubjectStateNotBetween(String value1, String value2) {
            addCriterion("subject_state not between", value1, value2, "subjectState");
            return (Criteria) this;
        }

        public Criteria andEntryFieldNameIsNull() {
            addCriterion("entry_field_name is null");
            return (Criteria) this;
        }

        public Criteria andEntryFieldNameIsNotNull() {
            addCriterion("entry_field_name is not null");
            return (Criteria) this;
        }

        public Criteria andEntryFieldNameEqualTo(String value) {
            addCriterion("entry_field_name =", value, "entryFieldName");
            return (Criteria) this;
        }

        public Criteria andEntryFieldNameNotEqualTo(String value) {
            addCriterion("entry_field_name <>", value, "entryFieldName");
            return (Criteria) this;
        }

        public Criteria andEntryFieldNameGreaterThan(String value) {
            addCriterion("entry_field_name >", value, "entryFieldName");
            return (Criteria) this;
        }

        public Criteria andEntryFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("entry_field_name >=", value, "entryFieldName");
            return (Criteria) this;
        }

        public Criteria andEntryFieldNameLessThan(String value) {
            addCriterion("entry_field_name <", value, "entryFieldName");
            return (Criteria) this;
        }

        public Criteria andEntryFieldNameLessThanOrEqualTo(String value) {
            addCriterion("entry_field_name <=", value, "entryFieldName");
            return (Criteria) this;
        }

        public Criteria andEntryFieldNameLike(String value) {
            addCriterion("entry_field_name like", value, "entryFieldName");
            return (Criteria) this;
        }

        public Criteria andEntryFieldNameNotLike(String value) {
            addCriterion("entry_field_name not like", value, "entryFieldName");
            return (Criteria) this;
        }

        public Criteria andEntryFieldNameIn(List<String> values) {
            addCriterion("entry_field_name in", values, "entryFieldName");
            return (Criteria) this;
        }

        public Criteria andEntryFieldNameNotIn(List<String> values) {
            addCriterion("entry_field_name not in", values, "entryFieldName");
            return (Criteria) this;
        }

        public Criteria andEntryFieldNameBetween(String value1, String value2) {
            addCriterion("entry_field_name between", value1, value2, "entryFieldName");
            return (Criteria) this;
        }

        public Criteria andEntryFieldNameNotBetween(String value1, String value2) {
            addCriterion("entry_field_name not between", value1, value2, "entryFieldName");
            return (Criteria) this;
        }

        public Criteria andFieldStateIsNull() {
            addCriterion("field_state is null");
            return (Criteria) this;
        }

        public Criteria andFieldStateIsNotNull() {
            addCriterion("field_state is not null");
            return (Criteria) this;
        }

        public Criteria andFieldStateEqualTo(String value) {
            addCriterion("field_state =", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateNotEqualTo(String value) {
            addCriterion("field_state <>", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateGreaterThan(String value) {
            addCriterion("field_state >", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateGreaterThanOrEqualTo(String value) {
            addCriterion("field_state >=", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateLessThan(String value) {
            addCriterion("field_state <", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateLessThanOrEqualTo(String value) {
            addCriterion("field_state <=", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateLike(String value) {
            addCriterion("field_state like", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateNotLike(String value) {
            addCriterion("field_state not like", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateIn(List<String> values) {
            addCriterion("field_state in", values, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateNotIn(List<String> values) {
            addCriterion("field_state not in", values, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateBetween(String value1, String value2) {
            addCriterion("field_state between", value1, value2, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateNotBetween(String value1, String value2) {
            addCriterion("field_state not between", value1, value2, "fieldState");
            return (Criteria) this;
        }

        public Criteria andAppointStartTimeIsNull() {
            addCriterion("appoint_start_time is null");
            return (Criteria) this;
        }

        public Criteria andAppointStartTimeIsNotNull() {
            addCriterion("appoint_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppointStartTimeEqualTo(String value) {
            addCriterion("appoint_start_time =", value, "appointStartTime");
            return (Criteria) this;
        }

        public Criteria andAppointStartTimeNotEqualTo(String value) {
            addCriterion("appoint_start_time <>", value, "appointStartTime");
            return (Criteria) this;
        }

        public Criteria andAppointStartTimeGreaterThan(String value) {
            addCriterion("appoint_start_time >", value, "appointStartTime");
            return (Criteria) this;
        }

        public Criteria andAppointStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("appoint_start_time >=", value, "appointStartTime");
            return (Criteria) this;
        }

        public Criteria andAppointStartTimeLessThan(String value) {
            addCriterion("appoint_start_time <", value, "appointStartTime");
            return (Criteria) this;
        }

        public Criteria andAppointStartTimeLessThanOrEqualTo(String value) {
            addCriterion("appoint_start_time <=", value, "appointStartTime");
            return (Criteria) this;
        }

        public Criteria andAppointStartTimeLike(String value) {
            addCriterion("appoint_start_time like", value, "appointStartTime");
            return (Criteria) this;
        }

        public Criteria andAppointStartTimeNotLike(String value) {
            addCriterion("appoint_start_time not like", value, "appointStartTime");
            return (Criteria) this;
        }

        public Criteria andAppointStartTimeIn(List<String> values) {
            addCriterion("appoint_start_time in", values, "appointStartTime");
            return (Criteria) this;
        }

        public Criteria andAppointStartTimeNotIn(List<String> values) {
            addCriterion("appoint_start_time not in", values, "appointStartTime");
            return (Criteria) this;
        }

        public Criteria andAppointStartTimeBetween(String value1, String value2) {
            addCriterion("appoint_start_time between", value1, value2, "appointStartTime");
            return (Criteria) this;
        }

        public Criteria andAppointStartTimeNotBetween(String value1, String value2) {
            addCriterion("appoint_start_time not between", value1, value2, "appointStartTime");
            return (Criteria) this;
        }

        public Criteria andAppointEndTimeIsNull() {
            addCriterion("appoint_end_time is null");
            return (Criteria) this;
        }

        public Criteria andAppointEndTimeIsNotNull() {
            addCriterion("appoint_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppointEndTimeEqualTo(String value) {
            addCriterion("appoint_end_time =", value, "appointEndTime");
            return (Criteria) this;
        }

        public Criteria andAppointEndTimeNotEqualTo(String value) {
            addCriterion("appoint_end_time <>", value, "appointEndTime");
            return (Criteria) this;
        }

        public Criteria andAppointEndTimeGreaterThan(String value) {
            addCriterion("appoint_end_time >", value, "appointEndTime");
            return (Criteria) this;
        }

        public Criteria andAppointEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("appoint_end_time >=", value, "appointEndTime");
            return (Criteria) this;
        }

        public Criteria andAppointEndTimeLessThan(String value) {
            addCriterion("appoint_end_time <", value, "appointEndTime");
            return (Criteria) this;
        }

        public Criteria andAppointEndTimeLessThanOrEqualTo(String value) {
            addCriterion("appoint_end_time <=", value, "appointEndTime");
            return (Criteria) this;
        }

        public Criteria andAppointEndTimeLike(String value) {
            addCriterion("appoint_end_time like", value, "appointEndTime");
            return (Criteria) this;
        }

        public Criteria andAppointEndTimeNotLike(String value) {
            addCriterion("appoint_end_time not like", value, "appointEndTime");
            return (Criteria) this;
        }

        public Criteria andAppointEndTimeIn(List<String> values) {
            addCriterion("appoint_end_time in", values, "appointEndTime");
            return (Criteria) this;
        }

        public Criteria andAppointEndTimeNotIn(List<String> values) {
            addCriterion("appoint_end_time not in", values, "appointEndTime");
            return (Criteria) this;
        }

        public Criteria andAppointEndTimeBetween(String value1, String value2) {
            addCriterion("appoint_end_time between", value1, value2, "appointEndTime");
            return (Criteria) this;
        }

        public Criteria andAppointEndTimeNotBetween(String value1, String value2) {
            addCriterion("appoint_end_time not between", value1, value2, "appointEndTime");
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