/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.generated.tables.TableName;
import org.jooq.generated.tables.interfaces.ITableName;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableNameRecord extends UpdatableRecordImpl<TableNameRecord> implements Record2<Integer, Integer>, ITableName {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.table_name.column_1</code>.
     */
    @Override
    public void setColumn_1(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.table_name.column_1</code>.
     */
    @Override
    public Integer getColumn_1() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.table_name.column_2</code>.
     */
    @Override
    public void setColumn_2(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.table_name.column_2</code>.
     */
    @Override
    public Integer getColumn_2() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TableName.TABLE_NAME.COLUMN_1;
    }

    @Override
    public Field<Integer> field2() {
        return TableName.TABLE_NAME.COLUMN_2;
    }

    @Override
    public Integer component1() {
        return getColumn_1();
    }

    @Override
    public Integer component2() {
        return getColumn_2();
    }

    @Override
    public Integer value1() {
        return getColumn_1();
    }

    @Override
    public Integer value2() {
        return getColumn_2();
    }

    @Override
    public TableNameRecord value1(Integer value) {
        setColumn_1(value);
        return this;
    }

    @Override
    public TableNameRecord value2(Integer value) {
        setColumn_2(value);
        return this;
    }

    @Override
    public TableNameRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ITableName from) {
        setColumn_1(from.getColumn_1());
        setColumn_2(from.getColumn_2());
    }

    @Override
    public <E extends ITableName> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TableNameRecord
     */
    public TableNameRecord() {
        super(TableName.TABLE_NAME);
    }

    /**
     * Create a detached, initialised TableNameRecord
     */
    public TableNameRecord(Integer column_1, Integer column_2) {
        super(TableName.TABLE_NAME);

        setColumn_1(column_1);
        setColumn_2(column_2);
    }

    /**
     * Create a detached, initialised TableNameRecord
     */
    public TableNameRecord(org.jooq.generated.tables.pojos.TableName value) {
        super(TableName.TABLE_NAME);

        if (value != null) {
            setColumn_1(value.getColumn_1());
            setColumn_2(value.getColumn_2());
        }
    }
}
