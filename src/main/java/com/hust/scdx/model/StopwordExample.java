package com.hust.scdx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StopwordExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	private int start;

	private int limit;

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public StopwordExample() {
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

		public Criteria andStopwordIdIsNull() {
			addCriterion("stopword_id is null");
			return (Criteria) this;
		}

		public Criteria andStopwordIdIsNotNull() {
			addCriterion("stopword_id is not null");
			return (Criteria) this;
		}

		public Criteria andStopwordIdEqualTo(Integer value) {
			addCriterion("stopword_id =", value, "stopwordId");
			return (Criteria) this;
		}

		public Criteria andStopwordIdNotEqualTo(Integer value) {
			addCriterion("stopword_id <>", value, "stopwordId");
			return (Criteria) this;
		}

		public Criteria andStopwordIdGreaterThan(Integer value) {
			addCriterion("stopword_id >", value, "stopwordId");
			return (Criteria) this;
		}

		public Criteria andStopwordIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("stopword_id >=", value, "stopwordId");
			return (Criteria) this;
		}

		public Criteria andStopwordIdLessThan(Integer value) {
			addCriterion("stopword_id <", value, "stopwordId");
			return (Criteria) this;
		}

		public Criteria andStopwordIdLessThanOrEqualTo(Integer value) {
			addCriterion("stopword_id <=", value, "stopwordId");
			return (Criteria) this;
		}

		public Criteria andStopwordIdIn(List<Integer> values) {
			addCriterion("stopword_id in", values, "stopwordId");
			return (Criteria) this;
		}

		public Criteria andStopwordIdNotIn(List<Integer> values) {
			addCriterion("stopword_id not in", values, "stopwordId");
			return (Criteria) this;
		}

		public Criteria andStopwordIdBetween(Integer value1, Integer value2) {
			addCriterion("stopword_id between", value1, value2, "stopwordId");
			return (Criteria) this;
		}

		public Criteria andStopwordIdNotBetween(Integer value1, Integer value2) {
			addCriterion("stopword_id not between", value1, value2, "stopwordId");
			return (Criteria) this;
		}

		public Criteria andWordIsNull() {
			addCriterion("word is null");
			return (Criteria) this;
		}

		public Criteria andWordIsNotNull() {
			addCriterion("word is not null");
			return (Criteria) this;
		}

		public Criteria andWordEqualTo(String value) {
			addCriterion("word =", value, "word");
			return (Criteria) this;
		}

		public Criteria andWordNotEqualTo(String value) {
			addCriterion("word <>", value, "word");
			return (Criteria) this;
		}

		public Criteria andWordGreaterThan(String value) {
			addCriterion("word >", value, "word");
			return (Criteria) this;
		}

		public Criteria andWordGreaterThanOrEqualTo(String value) {
			addCriterion("word >=", value, "word");
			return (Criteria) this;
		}

		public Criteria andWordLessThan(String value) {
			addCriterion("word <", value, "word");
			return (Criteria) this;
		}

		public Criteria andWordLessThanOrEqualTo(String value) {
			addCriterion("word <=", value, "word");
			return (Criteria) this;
		}

		public Criteria andWordLike(String value) {
			addCriterion("word like", value, "word");
			return (Criteria) this;
		}

		public Criteria andWordNotLike(String value) {
			addCriterion("word not like", value, "word");
			return (Criteria) this;
		}

		public Criteria andWordIn(List<String> values) {
			addCriterion("word in", values, "word");
			return (Criteria) this;
		}

		public Criteria andWordNotIn(List<String> values) {
			addCriterion("word not in", values, "word");
			return (Criteria) this;
		}

		public Criteria andWordBetween(String value1, String value2) {
			addCriterion("word between", value1, value2, "word");
			return (Criteria) this;
		}

		public Criteria andWordNotBetween(String value1, String value2) {
			addCriterion("word not between", value1, value2, "word");
			return (Criteria) this;
		}

		public Criteria andCreatorIsNull() {
			addCriterion("creator is null");
			return (Criteria) this;
		}

		public Criteria andCreatorIsNotNull() {
			addCriterion("creator is not null");
			return (Criteria) this;
		}

		public Criteria andCreatorEqualTo(String value) {
			addCriterion("creator =", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorNotEqualTo(String value) {
			addCriterion("creator <>", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorGreaterThan(String value) {
			addCriterion("creator >", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorGreaterThanOrEqualTo(String value) {
			addCriterion("creator >=", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorLessThan(String value) {
			addCriterion("creator <", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorLessThanOrEqualTo(String value) {
			addCriterion("creator <=", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorLike(String value) {
			addCriterion("creator like", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorNotLike(String value) {
			addCriterion("creator not like", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorIn(List<String> values) {
			addCriterion("creator in", values, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorNotIn(List<String> values) {
			addCriterion("creator not in", values, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorBetween(String value1, String value2) {
			addCriterion("creator between", value1, value2, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorNotBetween(String value1, String value2) {
			addCriterion("creator not between", value1, value2, "creator");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
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

		protected Criterion() {
			super();
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