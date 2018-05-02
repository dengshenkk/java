/**
 * 权限修饰符
 * private
 * 默认
 * protected
 * public
 */
package com.dengshen;
class Father {
    private void show() {
        System.out.println("私有 show");
    }

    void show2() {
        System.out.println("默认 show2");
    }

    protected void show3() {
        System.out.println("受保护 show3");
    }

    public void show4() {
        System.out.println("公共 show4");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.show();
        f.show2();
        f.show3();
        f.show4();
    }

}
