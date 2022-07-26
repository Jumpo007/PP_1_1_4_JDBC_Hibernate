package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDao userDao = new UserDaoHibernateImpl();
        Util.getSessionFactory().openSession();
        userDao.createUsersTable();
        userDao.saveUser("Name1", "LastName1", (byte) 7);
        userDao.saveUser("Name2", "LastName2", (byte) 13);
        userDao.saveUser("Name3", "LastName3", (byte) 19);
        userDao.saveUser("Name4", "LastName4", (byte) 25);
        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
        Util.getSessionFactory().close();

    }
}
