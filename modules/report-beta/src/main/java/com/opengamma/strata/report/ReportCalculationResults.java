/**
 * Copyright (C) 2015 - present by OpenGamma Inc. and the OpenGamma group of companies
 * 
 * Please see distribution for license.
 */
package com.opengamma.strata.report;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.google.common.collect.ImmutableList;
import com.opengamma.strata.engine.Column;
import com.opengamma.strata.engine.calculation.Results;
import com.opengamma.strata.finance.Trade;

/**
 * Stores a set of engine calculation results along with the context required to run reports.
 */
@BeanDefinition
public final class ReportCalculationResults implements ImmutableBean {

  /**
   * The valuation date.
   */
  @PropertyDefinition(validate = "notNull")
  private final LocalDate valuationDate;
  /**
   * The trades on which the results are calculated.
   */
  @PropertyDefinition(validate = "notNull")
  private final List<Trade> trades;
  /**
   * The columns contained in the results.
   */
  @PropertyDefinition(validate = "notNull")
  private final List<Column> columns;
  /**
   * The calculation results.
   */
  @PropertyDefinition(validate = "notNull")
  private final Results calculationResults;

  //-------------------------------------------------------------------------
  /**
   * Returns a new set of calculations results.
   *
   * @param valuationDate  the valuation date used in the calculations
   * @param trades  the trades for which the results were calculated
   * @param columns  the columns in the results
   * @param calculationResults  the results of the calculations
   * @return a new set of calculations results
   */
  public static ReportCalculationResults of(
      LocalDate valuationDate,
      List<Trade> trades,
      List<Column> columns,
      Results calculationResults) {

    return ReportCalculationResults.builder()
        .valuationDate(valuationDate)
        .trades(trades)
        .columns(columns)
        .calculationResults(calculationResults)
        .build();
  }

  //------------------------- AUTOGENERATED START -------------------------
  ///CLOVER:OFF
  /**
   * The meta-bean for {@code ReportCalculationResults}.
   * @return the meta-bean, not null
   */
  public static ReportCalculationResults.Meta meta() {
    return ReportCalculationResults.Meta.INSTANCE;
  }

  static {
    JodaBeanUtils.registerMetaBean(ReportCalculationResults.Meta.INSTANCE);
  }

  /**
   * Returns a builder used to create an instance of the bean.
   * @return the builder, not null
   */
  public static ReportCalculationResults.Builder builder() {
    return new ReportCalculationResults.Builder();
  }

  private ReportCalculationResults(
      LocalDate valuationDate,
      List<Trade> trades,
      List<Column> columns,
      Results calculationResults) {
    JodaBeanUtils.notNull(valuationDate, "valuationDate");
    JodaBeanUtils.notNull(trades, "trades");
    JodaBeanUtils.notNull(columns, "columns");
    JodaBeanUtils.notNull(calculationResults, "calculationResults");
    this.valuationDate = valuationDate;
    this.trades = ImmutableList.copyOf(trades);
    this.columns = ImmutableList.copyOf(columns);
    this.calculationResults = calculationResults;
  }

  @Override
  public ReportCalculationResults.Meta metaBean() {
    return ReportCalculationResults.Meta.INSTANCE;
  }

  @Override
  public <R> Property<R> property(String propertyName) {
    return metaBean().<R>metaProperty(propertyName).createProperty(this);
  }

  @Override
  public Set<String> propertyNames() {
    return metaBean().metaPropertyMap().keySet();
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the valuation date.
   * @return the value of the property, not null
   */
  public LocalDate getValuationDate() {
    return valuationDate;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the trades on which the results are calculated.
   * @return the value of the property, not null
   */
  public List<Trade> getTrades() {
    return trades;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the columns contained in the results.
   * @return the value of the property, not null
   */
  public List<Column> getColumns() {
    return columns;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the calculation results.
   * @return the value of the property, not null
   */
  public Results getCalculationResults() {
    return calculationResults;
  }

  //-----------------------------------------------------------------------
  /**
   * Returns a builder that allows this bean to be mutated.
   * @return the mutable builder, not null
   */
  public Builder toBuilder() {
    return new Builder(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      ReportCalculationResults other = (ReportCalculationResults) obj;
      return JodaBeanUtils.equal(getValuationDate(), other.getValuationDate()) &&
          JodaBeanUtils.equal(getTrades(), other.getTrades()) &&
          JodaBeanUtils.equal(getColumns(), other.getColumns()) &&
          JodaBeanUtils.equal(getCalculationResults(), other.getCalculationResults());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(getValuationDate());
    hash = hash * 31 + JodaBeanUtils.hashCode(getTrades());
    hash = hash * 31 + JodaBeanUtils.hashCode(getColumns());
    hash = hash * 31 + JodaBeanUtils.hashCode(getCalculationResults());
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(160);
    buf.append("ReportCalculationResults{");
    buf.append("valuationDate").append('=').append(getValuationDate()).append(',').append(' ');
    buf.append("trades").append('=').append(getTrades()).append(',').append(' ');
    buf.append("columns").append('=').append(getColumns()).append(',').append(' ');
    buf.append("calculationResults").append('=').append(JodaBeanUtils.toString(getCalculationResults()));
    buf.append('}');
    return buf.toString();
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code ReportCalculationResults}.
   */
  public static final class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code valuationDate} property.
     */
    private final MetaProperty<LocalDate> valuationDate = DirectMetaProperty.ofImmutable(
        this, "valuationDate", ReportCalculationResults.class, LocalDate.class);
    /**
     * The meta-property for the {@code trades} property.
     */
    @SuppressWarnings({"unchecked", "rawtypes" })
    private final MetaProperty<List<Trade>> trades = DirectMetaProperty.ofImmutable(
        this, "trades", ReportCalculationResults.class, (Class) List.class);
    /**
     * The meta-property for the {@code columns} property.
     */
    @SuppressWarnings({"unchecked", "rawtypes" })
    private final MetaProperty<List<Column>> columns = DirectMetaProperty.ofImmutable(
        this, "columns", ReportCalculationResults.class, (Class) List.class);
    /**
     * The meta-property for the {@code calculationResults} property.
     */
    private final MetaProperty<Results> calculationResults = DirectMetaProperty.ofImmutable(
        this, "calculationResults", ReportCalculationResults.class, Results.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "valuationDate",
        "trades",
        "columns",
        "calculationResults");

    /**
     * Restricted constructor.
     */
    private Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case 113107279:  // valuationDate
          return valuationDate;
        case -865715313:  // trades
          return trades;
        case 949721053:  // columns
          return columns;
        case 2096132333:  // calculationResults
          return calculationResults;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public ReportCalculationResults.Builder builder() {
      return new ReportCalculationResults.Builder();
    }

    @Override
    public Class<? extends ReportCalculationResults> beanType() {
      return ReportCalculationResults.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code valuationDate} property.
     * @return the meta-property, not null
     */
    public MetaProperty<LocalDate> valuationDate() {
      return valuationDate;
    }

    /**
     * The meta-property for the {@code trades} property.
     * @return the meta-property, not null
     */
    public MetaProperty<List<Trade>> trades() {
      return trades;
    }

    /**
     * The meta-property for the {@code columns} property.
     * @return the meta-property, not null
     */
    public MetaProperty<List<Column>> columns() {
      return columns;
    }

    /**
     * The meta-property for the {@code calculationResults} property.
     * @return the meta-property, not null
     */
    public MetaProperty<Results> calculationResults() {
      return calculationResults;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case 113107279:  // valuationDate
          return ((ReportCalculationResults) bean).getValuationDate();
        case -865715313:  // trades
          return ((ReportCalculationResults) bean).getTrades();
        case 949721053:  // columns
          return ((ReportCalculationResults) bean).getColumns();
        case 2096132333:  // calculationResults
          return ((ReportCalculationResults) bean).getCalculationResults();
      }
      return super.propertyGet(bean, propertyName, quiet);
    }

    @Override
    protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
      metaProperty(propertyName);
      if (quiet) {
        return;
      }
      throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
    }

  }

  //-----------------------------------------------------------------------
  /**
   * The bean-builder for {@code ReportCalculationResults}.
   */
  public static final class Builder extends DirectFieldsBeanBuilder<ReportCalculationResults> {

    private LocalDate valuationDate;
    private List<Trade> trades = ImmutableList.of();
    private List<Column> columns = ImmutableList.of();
    private Results calculationResults;

    /**
     * Restricted constructor.
     */
    private Builder() {
    }

    /**
     * Restricted copy constructor.
     * @param beanToCopy  the bean to copy from, not null
     */
    private Builder(ReportCalculationResults beanToCopy) {
      this.valuationDate = beanToCopy.getValuationDate();
      this.trades = ImmutableList.copyOf(beanToCopy.getTrades());
      this.columns = ImmutableList.copyOf(beanToCopy.getColumns());
      this.calculationResults = beanToCopy.getCalculationResults();
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case 113107279:  // valuationDate
          return valuationDate;
        case -865715313:  // trades
          return trades;
        case 949721053:  // columns
          return columns;
        case 2096132333:  // calculationResults
          return calculationResults;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @SuppressWarnings("unchecked")
    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case 113107279:  // valuationDate
          this.valuationDate = (LocalDate) newValue;
          break;
        case -865715313:  // trades
          this.trades = (List<Trade>) newValue;
          break;
        case 949721053:  // columns
          this.columns = (List<Column>) newValue;
          break;
        case 2096132333:  // calculationResults
          this.calculationResults = (Results) newValue;
          break;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
      return this;
    }

    @Override
    public Builder set(MetaProperty<?> property, Object value) {
      super.set(property, value);
      return this;
    }

    @Override
    public Builder setString(String propertyName, String value) {
      setString(meta().metaProperty(propertyName), value);
      return this;
    }

    @Override
    public Builder setString(MetaProperty<?> property, String value) {
      super.setString(property, value);
      return this;
    }

    @Override
    public Builder setAll(Map<String, ? extends Object> propertyValueMap) {
      super.setAll(propertyValueMap);
      return this;
    }

    @Override
    public ReportCalculationResults build() {
      return new ReportCalculationResults(
          valuationDate,
          trades,
          columns,
          calculationResults);
    }

    //-----------------------------------------------------------------------
    /**
     * Sets the valuation date.
     * @param valuationDate  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder valuationDate(LocalDate valuationDate) {
      JodaBeanUtils.notNull(valuationDate, "valuationDate");
      this.valuationDate = valuationDate;
      return this;
    }

    /**
     * Sets the trades on which the results are calculated.
     * @param trades  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder trades(List<Trade> trades) {
      JodaBeanUtils.notNull(trades, "trades");
      this.trades = trades;
      return this;
    }

    /**
     * Sets the {@code trades} property in the builder
     * from an array of objects.
     * @param trades  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder trades(Trade... trades) {
      return trades(ImmutableList.copyOf(trades));
    }

    /**
     * Sets the columns contained in the results.
     * @param columns  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder columns(List<Column> columns) {
      JodaBeanUtils.notNull(columns, "columns");
      this.columns = columns;
      return this;
    }

    /**
     * Sets the {@code columns} property in the builder
     * from an array of objects.
     * @param columns  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder columns(Column... columns) {
      return columns(ImmutableList.copyOf(columns));
    }

    /**
     * Sets the calculation results.
     * @param calculationResults  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder calculationResults(Results calculationResults) {
      JodaBeanUtils.notNull(calculationResults, "calculationResults");
      this.calculationResults = calculationResults;
      return this;
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(160);
      buf.append("ReportCalculationResults.Builder{");
      buf.append("valuationDate").append('=').append(JodaBeanUtils.toString(valuationDate)).append(',').append(' ');
      buf.append("trades").append('=').append(JodaBeanUtils.toString(trades)).append(',').append(' ');
      buf.append("columns").append('=').append(JodaBeanUtils.toString(columns)).append(',').append(' ');
      buf.append("calculationResults").append('=').append(JodaBeanUtils.toString(calculationResults));
      buf.append('}');
      return buf.toString();
    }

  }

  ///CLOVER:ON
  //-------------------------- AUTOGENERATED END --------------------------
}
