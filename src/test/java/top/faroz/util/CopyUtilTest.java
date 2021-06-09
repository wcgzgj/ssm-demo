package top.faroz.util;

import org.junit.Test;
import top.faroz.pojo.Adminrole;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CopyUtilTest {

    @Test
    public void copy() {
        Adminrole role1 = new Adminrole();
        role1.setRoleId(12);
        role1.setRoleName("jk");

        Adminrole copy = CopyUtil.copy(role1, Adminrole.class);
        System.out.println(copy);
    }

    @Test
    public void copyList() {
        Adminrole role1 = new Adminrole();
        role1.setRoleId(12);
        role1.setRoleName("jk");

        Adminrole role2 = new Adminrole();
        role2.setRoleId(13);
        role2.setRoleName("tp");

        List<Adminrole> list = new ArrayList<>();
        list.add(role1);
        list.add(role2);

        List<Adminrole> target = CopyUtil.copyList(list, Adminrole.class);
        System.out.println(target);
    }
}