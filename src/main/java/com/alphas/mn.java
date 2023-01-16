package com.alphas;

import com.alphas.dao.StudentDao;

public class mn {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        System.out.println(studentDao.getAll());
    }
}
