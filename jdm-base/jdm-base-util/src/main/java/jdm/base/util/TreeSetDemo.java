/*
 * Copyright (C) 2020 realpai <paiap@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package jdm.base.util;

import java.util.TreeSet;
import jdm.utils.demo.AbstractDemo;

/**
 *
 * @author realpai <paiap@outlook.com>
 */
public class TreeSetDemo extends AbstractDemo {

    private TreeSet<Integer> ts;

    @Override
    public void index() {
        baseDemo();
    }

    public void baseDemo() {
        ts = new TreeSet<>();
        ts.add(1);
        ts.add(10);
        ts.add(100);
        ts.add(1000);

        for (Integer t : ts) {
            System.out.println(t);
        }

        ts.forEach((t) -> {
            System.out.println("使用TreeSet的forEach()方法遍历：" + t);
        });
    }

}