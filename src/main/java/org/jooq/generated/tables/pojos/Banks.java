/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.pojos;


import org.jooq.generated.tables.interfaces.IBanks;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Banks implements IBanks {

    private static final long serialVersionUID = 1L;

    private String  accountNumber;
    private Double  trust;
    private Integer transactionFee;

    public Banks() {}

    public Banks(IBanks value) {
        this.accountNumber = value.getAccountNumber();
        this.trust = value.getTrust();
        this.transactionFee = value.getTransactionFee();
    }

    public Banks(
        String  accountNumber,
        Double  trust,
        Integer transactionFee
    ) {
        this.accountNumber = accountNumber;
        this.trust = trust;
        this.transactionFee = transactionFee;
    }

    /**
     * Getter for <code>public.banks.account_number</code>.
     */
    @Override
    public String getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Setter for <code>public.banks.account_number</code>.
     */
    @Override
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Getter for <code>public.banks.trust</code>.
     */
    @Override
    public Double getTrust() {
        return this.trust;
    }

    /**
     * Setter for <code>public.banks.trust</code>.
     */
    @Override
    public void setTrust(Double trust) {
        this.trust = trust;
    }

    /**
     * Getter for <code>public.banks.transaction_fee</code>.
     */
    @Override
    public Integer getTransactionFee() {
        return this.transactionFee;
    }

    /**
     * Setter for <code>public.banks.transaction_fee</code>.
     */
    @Override
    public void setTransactionFee(Integer transactionFee) {
        this.transactionFee = transactionFee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Banks (");

        sb.append(accountNumber);
        sb.append(", ").append(trust);
        sb.append(", ").append(transactionFee);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IBanks from) {
        setAccountNumber(from.getAccountNumber());
        setTrust(from.getTrust());
        setTransactionFee(from.getTransactionFee());
    }

    @Override
    public <E extends IBanks> E into(E into) {
        into.from(this);
        return into;
    }
}
