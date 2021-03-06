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
package jdm.base.util.function.samples.consumer;

/**
 *
 * @author realpai <paiap@outlook.com>
 */
public class ProducerDemo implements Runnable {

    private RepositoryDemo repo;

    /**
     * Get the value of repo
     *
     * @return the value of repo
     */
    public RepositoryDemo getRepo() {
        return repo;
    }

    /**
     * Set the value of repo
     *
     * @param repo new value of repo
     */
    public void setRepo(RepositoryDemo repo) {
        this.repo = repo;
    }

    ProducerDemo(RepositoryDemo rd) {
        this.repo = rd;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            repo.setUsefulData(i);
        }
    }

}
