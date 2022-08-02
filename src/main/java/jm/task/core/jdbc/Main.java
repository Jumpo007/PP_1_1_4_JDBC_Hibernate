package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        Util.getSessionFactory().openSession();
        userDaoHibernate.createUsersTable();
        userDaoHibernate.saveUser("Name1", "LastName1", (byte) 7);
        userDaoHibernate.saveUser("Name2", "LastName2", (byte) 13);
        userDaoHibernate.saveUser("Name3", "LastName3", (byte) 19);
        userDaoHibernate.saveUser("Name4", "LastName4", (byte) 25);
        System.out.println(userDaoHibernate.getAllUsers());
        userDaoHibernate.cleanUsersTable();
        userDaoHibernate.dropUsersTable();
        Util.getSessionFactory().close();

    }
}
