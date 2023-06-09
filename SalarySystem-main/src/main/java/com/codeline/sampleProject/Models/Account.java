package com.codeline.sampleProject.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
public class Account extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column(name = "AccountName_name")
    String bankName;

    String accountNumber;

    String bankBranch;

    String swiftCode;

    String accountHolderName;

    String accountType;

    Integer branchCode;
}
