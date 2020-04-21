/* 
 * Copyright (C) 2019 Ruslan López Carro
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
package inventarios.service;

import inventarios.repository.ChainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ticketcodes.to.Chain;

import java.util.List;

/**
 *
 * @author Ruslan López Carro
 */
@Service
public class ChainService {

    private final ChainRepository chainRepository;

    @Autowired
    public ChainService(ChainRepository chainRepository) {
        this.chainRepository = chainRepository;
    }

    public List<Chain> findAll() {
        return chainRepository.findAll();
    }

    public <S extends Chain> S save(S s) {
        return chainRepository.save(s);
    }
    
}
