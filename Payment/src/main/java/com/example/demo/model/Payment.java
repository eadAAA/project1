package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Payment {
    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true)
    private Integer idCommand;

    private Integer count;

    private Long cardNum;


    public Payment() {

    }


    public Payment(int id, Integer idCommand, Integer count, Long cardNum) {
        this.id = id;
        this.idCommand = idCommand;
        this.count = count;
        this.cardNum = cardNum;
    }

    public int getId() {
        return this.id;
    }

    public Integer getIdCommand() {
        return this.idCommand;
    }

    public Integer getCount() {
        return this.count;
    }

    public Long getCardNum() {
        return this.cardNum;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdCommand(Integer idCommand) {
        this.idCommand = idCommand;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setCardNum(Long cardNum) {
        this.cardNum = cardNum;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Payment)) return false;
        final Payment other = (Payment) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$idCommand = this.getIdCommand();
        final Object other$idCommand = other.getIdCommand();
        if (this$idCommand == null ? other$idCommand != null : !this$idCommand.equals(other$idCommand)) return false;
        final Object this$count = this.getCount();
        final Object other$count = other.getCount();
        if (this$count == null ? other$count != null : !this$count.equals(other$count)) return false;
        final Object this$cardNum = this.getCardNum();
        final Object other$cardNum = other.getCardNum();
        if (this$cardNum == null ? other$cardNum != null : !this$cardNum.equals(other$cardNum)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Payment;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        final Object $idCommand = this.getIdCommand();
        result = result * PRIME + ($idCommand == null ? 43 : $idCommand.hashCode());
        final Object $count = this.getCount();
        result = result * PRIME + ($count == null ? 43 : $count.hashCode());
        final Object $cardNum = this.getCardNum();
        result = result * PRIME + ($cardNum == null ? 43 : $cardNum.hashCode());
        return result;
    }

    public String toString() {
        return "Payment(id=" + this.getId() + ", idCommand=" + this.getIdCommand() + ", count=" + this.getCount() + ", cardNum=" + this.getCardNum() + ")";
    }
}
