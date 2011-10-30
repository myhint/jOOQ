/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class Test extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 1485629092;

	/**
	 * The singleton instance of TEST
	 */
	public static final Test TEST = new Test();

	/**
	 * No further instances allowed
	 */
	private Test() {
		super("TEST");
	}

	/*
	 * instance initialiser
	 */
	{
		addMapping("TEST.O_INVALID_TYPE", org.jooq.test.oracle.generatedclasses.udt.records.OInvalidTypeRecord.class);
		addMapping("TEST.T_INVALID_TYPE", org.jooq.test.oracle.generatedclasses.udt.records.TInvalidTypeRecord.class);
		addMapping("TEST.U_ADDRESS_TYPE", org.jooq.test.oracle.generatedclasses.udt.records.UAddressTypeRecord.class);
		addMapping("TEST.U_INVALID_TYPE", org.jooq.test.oracle.generatedclasses.udt.records.UInvalidTypeRecord.class);
		addMapping("TEST.U_STREET_TYPE", org.jooq.test.oracle.generatedclasses.udt.records.UStreetTypeRecord.class);
	}

	@Override
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(org.jooq.test.oracle.generatedclasses.Sequences.S_AUTHOR_ID);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.test.oracle.generatedclasses.tables.TArrays.T_ARRAYS,
			org.jooq.test.oracle.generatedclasses.tables.TAuthor.T_AUTHOR,
			org.jooq.test.oracle.generatedclasses.tables.TBook.T_BOOK,
			org.jooq.test.oracle.generatedclasses.tables.TBookStore.T_BOOK_STORE,
			org.jooq.test.oracle.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE,
			org.jooq.test.oracle.generatedclasses.tables.TDirectory.T_DIRECTORY,
			org.jooq.test.oracle.generatedclasses.tables.TTriggers.T_TRIGGERS,
			org.jooq.test.oracle.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE,
			org.jooq.test.oracle.generatedclasses.tables.T_658Ref.T_658_REF,
			org.jooq.test.oracle.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST,
			org.jooq.test.oracle.generatedclasses.tables.T_785.T_785,
			org.jooq.test.oracle.generatedclasses.tables.VAuthor.V_AUTHOR,
			org.jooq.test.oracle.generatedclasses.tables.VBook.V_BOOK,
			org.jooq.test.oracle.generatedclasses.tables.VIncomplete.V_INCOMPLETE,
			org.jooq.test.oracle.generatedclasses.tables.VLibrary.V_LIBRARY,
			org.jooq.test.oracle.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69,
			org.jooq.test.oracle.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71,
			org.jooq.test.oracle.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85,
			org.jooq.test.oracle.generatedclasses.tables.XUnused.X_UNUSED);
	}

	@Override
	public final java.util.List<org.jooq.UDT<?>> getUDTs() {
		return java.util.Arrays.<org.jooq.UDT<?>>asList(
			org.jooq.test.oracle.generatedclasses.udt.OInvalidType.O_INVALID_TYPE,
			org.jooq.test.oracle.generatedclasses.udt.TInvalidType.T_INVALID_TYPE,
			org.jooq.test.oracle.generatedclasses.udt.UAddressType.U_ADDRESS_TYPE,
			org.jooq.test.oracle.generatedclasses.udt.UInvalidType.U_INVALID_TYPE,
			org.jooq.test.oracle.generatedclasses.udt.UStreetType.U_STREET_TYPE);
	}
}
