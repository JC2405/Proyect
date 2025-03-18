package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		String[] nombres = {
			"Cristian",
			"Gabriel",

		};
		for (String nombre : nombres) {
			JOptionPane.showMessageDialog(null, nombre);
		}

	}

}
