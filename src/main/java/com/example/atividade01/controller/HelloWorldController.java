package com.example.atividade01.controller;

import com.example.atividade01.model.Bsm;
import com.example.atividade01.model.Objetivos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
    public class HelloWorldController {


        @GetMapping("/ola")
        public String helloWorld() {
            return "Hello World";
        }


        @GetMapping("/bsm")
        public List<Bsm> getBsm(){
            return Arrays.asList(
                    new Bsm(1, "Mentalidade de Crescimento"),
                    new Bsm(2, "Responsabilidade Pessoal"),
                    new Bsm(3, "Orientação ao Futuro"),
                    new Bsm(4, "Persistência"),
                    new Bsm(5, "Trabalho em Equipe"),
                    new Bsm(6, "Comunicação"),
                    new Bsm(7, "Proatividade"),
                    new Bsm(8, "Orientação ao Detalhe")
            );
         }


        @GetMapping("/objetivos")
        public List<Objetivos> getObjetivos(){
        return Arrays.asList(
                new Objetivos(1, "Aprender Spring"),
                new Objetivos(2, "Estudar para a entrevista"),
                new Objetivos(3, "Treinar 3x na semana"),
                new Objetivos(4, "Estudar arquitetura")
            );
        }
    }

