/*
 * Copyright (c) / / @author Gadiler 4/4/2021 .
 * https://github.com/Gadiler
 */

package com.memorygameback.utils;


import com.memorygameback.accessingdatajpa.CardGameRepository;
import com.memorygameback.accessingdatajpa.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ArtUtils {

    public static final String BOOTSTRAP = "\n██████╗  ██████╗  ██████╗ ████████╗███████╗████████╗██████╗  █████╗ ██████╗ \n" +
            "██╔══██╗██╔═══██╗██╔═══██╗╚══██╔══╝██╔════╝╚══██╔══╝██╔══██╗██╔══██╗██╔══██╗\n" +
            "██████╔╝██║   ██║██║   ██║   ██║   ███████╗   ██║   ██████╔╝███████║██████╔╝\n" +
            "██╔══██╗██║   ██║██║   ██║   ██║   ╚════██║   ██║   ██╔══██╗██╔══██║██╔═══╝ \n" +
            "██████╔╝╚██████╔╝╚██████╔╝   ██║   ███████║   ██║   ██║  ██║██║  ██║██║     \n" +
            "╚═════╝  ╚═════╝  ╚═════╝    ╚═╝   ╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     \n" +
            "                                                                            ";
    public static final String User_SERVICE = "\n██╗   ██╗███████╗███████╗██████╗     ███████╗███████╗██████╗ ██╗   ██╗██╗ ██████╗███████╗\n" +
            "██║   ██║██╔════╝██╔════╝██╔══██╗    ██╔════╝██╔════╝██╔══██╗██║   ██║██║██╔════╝██╔════╝\n" +
            "██║   ██║███████╗█████╗  ██████╔╝    ███████╗█████╗  ██████╔╝██║   ██║██║██║     █████╗  \n" +
            "██║   ██║╚════██║██╔══╝  ██╔══██╗    ╚════██║██╔══╝  ██╔══██╗╚██╗ ██╔╝██║██║     ██╔══╝  \n" +
            "╚██████╔╝███████║███████╗██║  ██║    ███████║███████╗██║  ██║ ╚████╔╝ ██║╚██████╗███████╗\n" +
            " ╚═════╝ ╚══════╝╚══════╝╚═╝  ╚═╝    ╚══════╝╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚═╝ ╚═════╝╚══════╝\n" +
            "                                                                                         ";
    public static final String CUSTOMER_SERVICE = "\n ██████╗██╗   ██╗███████╗████████╗ ██████╗ ███╗   ███╗███████╗██████╗     ███████╗███████╗██████╗ ██╗   ██╗██╗ ██████╗███████╗\n" +
            "██╔════╝██║   ██║██╔════╝╚══██╔══╝██╔═══██╗████╗ ████║██╔════╝██╔══██╗    ██╔════╝██╔════╝██╔══██╗██║   ██║██║██╔════╝██╔════╝\n" +
            "██║     ██║   ██║███████╗   ██║   ██║   ██║██╔████╔██║█████╗  ██████╔╝    ███████╗█████╗  ██████╔╝██║   ██║██║██║     █████╗  \n" +
            "██║     ██║   ██║╚════██║   ██║   ██║   ██║██║╚██╔╝██║██╔══╝  ██╔══██╗    ╚════██║██╔══╝  ██╔══██╗╚██╗ ██╔╝██║██║     ██╔══╝  \n" +
            "╚██████╗╚██████╔╝███████║   ██║   ╚██████╔╝██║ ╚═╝ ██║███████╗██║  ██║    ███████║███████╗██║  ██║ ╚████╔╝ ██║╚██████╗███████╗\n" +
            " ╚═════╝ ╚═════╝ ╚══════╝   ╚═╝    ╚═════╝ ╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝    ╚══════╝╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚═╝ ╚═════╝╚══════╝\n" +
            "                                                                                                                              ";
    public static final String LOGIN_MANAGER = "\n██╗      ██████╗  ██████╗ ██╗███╗   ██╗    ███╗   ███╗ █████╗ ███╗   ██╗ █████╗  ██████╗ ███████╗██████╗     ████████╗███████╗███████╗████████╗\n" +
            "██║     ██╔═══██╗██╔════╝ ██║████╗  ██║    ████╗ ████║██╔══██╗████╗  ██║██╔══██╗██╔════╝ ██╔════╝██╔══██╗    ╚══██╔══╝██╔════╝██╔════╝╚══██╔══╝\n" +
            "██║     ██║   ██║██║  ███╗██║██╔██╗ ██║    ██╔████╔██║███████║██╔██╗ ██║███████║██║  ███╗█████╗  ██████╔╝       ██║   █████╗  ███████╗   ██║   \n" +
            "██║     ██║   ██║██║   ██║██║██║╚██╗██║    ██║╚██╔╝██║██╔══██║██║╚██╗██║██╔══██║██║   ██║██╔══╝  ██╔══██╗       ██║   ██╔══╝  ╚════██║   ██║   \n" +
            "███████╗╚██████╔╝╚██████╔╝██║██║ ╚████║    ██║ ╚═╝ ██║██║  ██║██║ ╚████║██║  ██║╚██████╔╝███████╗██║  ██║       ██║   ███████╗███████║   ██║   \n" +
            "╚══════╝ ╚═════╝  ╚═════╝ ╚═╝╚═╝  ╚═══╝    ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝       ╚═╝   ╚══════╝╚══════╝   ╚═╝   \n" +
            "                                                                                                                                               ";

    public static final String ADMIN_SERVICE = "\n █████╗ ██████╗ ███╗   ███╗██╗███╗   ██╗    ███████╗███████╗██████╗ ██╗   ██╗██╗ ██████╗███████╗\n" +
            "██╔══██╗██╔══██╗████╗ ████║██║████╗  ██║    ██╔════╝██╔════╝██╔══██╗██║   ██║██║██╔════╝██╔════╝\n" +
            "███████║██║  ██║██╔████╔██║██║██╔██╗ ██║    ███████╗█████╗  ██████╔╝██║   ██║██║██║     █████╗  \n" +
            "██╔══██║██║  ██║██║╚██╔╝██║██║██║╚██╗██║    ╚════██║██╔══╝  ██╔══██╗╚██╗ ██╔╝██║██║     ██╔══╝  \n" +
            "██║  ██║██████╔╝██║ ╚═╝ ██║██║██║ ╚████║    ███████║███████╗██║  ██║ ╚████╔╝ ██║╚██████╗███████╗\n" +
            "╚═╝  ╚═╝╚═════╝ ╚═╝     ╚═╝╚═╝╚═╝  ╚═══╝    ╚══════╝╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚═╝ ╚═════╝╚══════╝\n" +
            "                                                                                                ";

    public static int TEST_COUNT = 1;

    //    private final CouponRepository couponRepository;
    private final CardGameRepository cardGameRepository;
    private final UserRepository userRepository;

    public static void testTitle(String methodName) {
        StringBuilder sb = new StringBuilder("# Test unit NO. " + TEST_COUNT++ + " Method: " + methodName + "\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(sb);
    }

    public static void printSeparator() {
        StringBuilder sb = new StringBuilder("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println(sb);
    }

    public void printUsersTable() {
        TableList t1 = new TableList("Id", "UserName", "highestScore").withUnicode(false);
        userRepository.findAll().forEach(user -> t1.addRow(String.valueOf(user.getId()), String.valueOf(user.getUserName()), String.valueOf(user.getHighestScore())));
        t1.print();
    }

    public void printGameTable() {
        TableList t1 = new TableList("Id", "Flip Counter", "State", "UserID").withUnicode(false);
        cardGameRepository.findAll().forEach(game -> t1.addRow(String.valueOf(game.getId()), String.valueOf(game.getFlipCounter()), String.valueOf(game.getState()), String.valueOf(game.getUserId())));
        t1.print();
    }

//    public void printCouponsTable() {
//        TableList t1 = new TableList("Id", "CompanyId", "Category", "Start Date", "End Date", "Amount", "Price", "Image", "Description", "Title").withUnicode(false);
//        couponRepository.findAll().forEach(coupon -> t1.addRow(String.valueOf(coupon.getId()), String.valueOf(coupon.getCompanyId()), String.valueOf(coupon.getCategory()), String.valueOf(coupon.getStartDate()), String.valueOf(coupon.getEndDate()), String.valueOf(coupon.getAmount()), String.valueOf(coupon.getPrice()), coupon.getImage(), coupon.getDescription(), coupon.getTitle()));
//        t1.print();
//    }
//
//    public void printCompaniesTable() {
//        TableList t1 = new TableList("Id", "Name", "Email", "Password").withUnicode(false);
//        companyRepository.findAll().forEach(company -> t1.addRow(String.valueOf(company.getId()), company.getName(), company.getEmail(), company.getPassword()));
//        t1.print();
//    }
//
//    public void printCustomersTable() {
//        TableList t1 = new TableList("Id", "First Name", "Last Name", "Email", "Password");
//        customerRepository.findAll().forEach(customer -> t1.addRow(String.valueOf(customer.getId()), customer.getFirstName(), customer.getLastName(), customer.getEmail(), customer.getPassword()));
//        t1.print();
//    }

}
