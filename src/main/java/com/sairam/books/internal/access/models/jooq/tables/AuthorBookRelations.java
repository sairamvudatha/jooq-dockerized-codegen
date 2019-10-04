/*
 * This file is generated by jOOQ.
 */
package com.sairam.books.internal.access.models.jooq.tables;


import com.sairam.books.internal.access.models.jooq.Books;
import com.sairam.books.internal.access.models.jooq.Indexes;
import com.sairam.books.internal.access.models.jooq.Keys;
import com.sairam.books.internal.access.models.jooq.tables.records.AuthorBookRelationsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorBookRelations extends TableImpl<AuthorBookRelationsRecord> {

    private static final long serialVersionUID = 1117040773;

    /**
     * The reference instance of <code>books.author_book_relations</code>
     */
    public static final AuthorBookRelations AUTHOR_BOOK_RELATIONS = new AuthorBookRelations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthorBookRelationsRecord> getRecordType() {
        return AuthorBookRelationsRecord.class;
    }

    /**
     * The column <code>books.author_book_relations.author_id</code>.
     */
    public final TableField<AuthorBookRelationsRecord, String> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.CHAR(36).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>books.author_book_relations.book_id</code>.
     */
    public final TableField<AuthorBookRelationsRecord, String> BOOK_ID = createField("book_id", org.jooq.impl.SQLDataType.CHAR(36).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * Create a <code>books.author_book_relations</code> table reference
     */
    public AuthorBookRelations() {
        this(DSL.name("author_book_relations"), null);
    }

    /**
     * Create an aliased <code>books.author_book_relations</code> table reference
     */
    public AuthorBookRelations(String alias) {
        this(DSL.name(alias), AUTHOR_BOOK_RELATIONS);
    }

    /**
     * Create an aliased <code>books.author_book_relations</code> table reference
     */
    public AuthorBookRelations(Name alias) {
        this(alias, AUTHOR_BOOK_RELATIONS);
    }

    private AuthorBookRelations(Name alias, Table<AuthorBookRelationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuthorBookRelations(Name alias, Table<AuthorBookRelationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AuthorBookRelations(Table<O> child, ForeignKey<O, AuthorBookRelationsRecord> key) {
        super(child, key, AUTHOR_BOOK_RELATIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Books.BOOKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.AUTHOR_BOOK_RELATIONS_BOOK_ID, Indexes.AUTHOR_BOOK_RELATIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AuthorBookRelationsRecord> getPrimaryKey() {
        return Keys.KEY_AUTHOR_BOOK_RELATIONS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AuthorBookRelationsRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthorBookRelationsRecord>>asList(Keys.KEY_AUTHOR_BOOK_RELATIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AuthorBookRelationsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AuthorBookRelationsRecord, ?>>asList(Keys.AUTHOR_BOOK_RELATIONS_IBFK_1, Keys.AUTHOR_BOOK_RELATIONS_IBFK_2);
    }

    public Authors authors() {
        return new Authors(this, Keys.AUTHOR_BOOK_RELATIONS_IBFK_1);
    }

    public com.sairam.books.internal.access.models.jooq.tables.Books books() {
        return new com.sairam.books.internal.access.models.jooq.tables.Books(this, Keys.AUTHOR_BOOK_RELATIONS_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorBookRelations as(String alias) {
        return new AuthorBookRelations(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorBookRelations as(Name alias) {
        return new AuthorBookRelations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuthorBookRelations rename(String name) {
        return new AuthorBookRelations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuthorBookRelations rename(Name name) {
        return new AuthorBookRelations(name, null);
    }
}
