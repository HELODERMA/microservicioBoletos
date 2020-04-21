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

import inventarios.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import ticketcodes.to.TicketCode;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Ruslan López Carro
 */
@Service
public class TicketService {
    private final TicketRepository ticketRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<TicketCode> findAll() {
        return ticketRepository.findAll();
    }

    public <S extends TicketCode> S save(S s) {
        return ticketRepository.save(s);
    }

    public <S extends TicketCode> Optional<S> findOne(Example<S> exmpl) {
        return ticketRepository.findOne(exmpl);
    }

    public void delete(TicketCode t) {
        ticketRepository.delete(t);
    }

}
