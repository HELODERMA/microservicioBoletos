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
package inventarios.controller;

import inventarios.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ticketcodes.to.TicketCode;

import java.util.List;
import java.util.Optional;

@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping("/tickets")
    public List<TicketCode> findAll() {
        return ticketService.findAll();
    }

    @PostMapping("/tickets")
    public <S extends TicketCode> S save(S s) {
        return ticketService.save(s);
    }

    @PostMapping("/ticket")
    public <S extends TicketCode> Optional<S> findOne(@RequestBody S product) {
        return ticketService.findOne(Example.of(product));
    }

    @DeleteMapping("/tickets")
    public void delete(@RequestBody TicketCode product) {
        ticketService.delete(product);
    }
}
