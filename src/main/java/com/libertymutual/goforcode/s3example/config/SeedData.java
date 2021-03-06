package com.libertymutual.goforcode.s3example.config;

import org.springframework.context.annotation.Configuration;
import com.libertymutual.goforcode.s3example.models.Tool;
import com.libertymutual.goforcode.s3example.repositories.ToolRepo;

	@Configuration
	public class SeedData {
		
		public SeedData(ToolRepo toolRepo) {
			System.out.println("Starting Seed");
			Tool tool =new Tool("123456789012345678901234567890", "12345678901234567890123456789012345678901234567890123456789012345678901234567890", null);
			toolRepo.save(new Tool("123456789012345678901234567890", "12345678901234567890123456789012345678901234567890123456789012345678901234567890", "https://s3-us-west-2.amazonaws.com/goforcode-oct2017-communityshade/Focusing+LED+Flashlight.jpg"));
			toolRepo.save(new Tool("Flashlight", "Coast HP7 Focusing LED Flashlight", null));

//			toolRepo.save(new Tool("Flashlight", "Coast HP7 Focusing LED Flashlight", "Safety & Security", "Coast", null, null, "Available", 4, null, user1));
//			toolRepo.save(new Tool("Hammer Drill", "Bosh 13.5 Amp Corded 1-78 in. Rotary Hammer Drill", "Power Tool", "Bosh", null, null, "Available", 1, null, user1));
//			toolRepo.save(new Tool("Lantern", "Eveready Readyflex Floating Lantern", "Safety & Security", "Eveready", null, null, "Available", 4, null, user1));
//			toolRepo.save(new Tool("Flashlight", "Coast HP7 Focusing LED Flashlight", "Safety & Security", "Coast", null, null, "Available", 4, null, user1));
//			toolRepo.save(new Tool("Heated Jacket", "Dewalt Unisex Large High Visibility Yellow 20-Volt Heated Jacket", "Gear & Equipment", "Dewalt", null, null, "Available", 5, null, user2));
//			toolRepo.save(new Tool("PVC Boots", "Mat Size 11 PVC Black Boots", "Gear & Equipment", "Mat", null, null, "Available", 5, null, user2));	
//			toolRepo.save(new Tool("Welder", "Lincoln Electric 180 Amp Weld-Pak MIG Wire Feed Welder", "Welding & Soldering", "Lincoln Electric", null, null, "Available", 3, null, user2));
//			toolRepo.save(new Tool("Soldering Iron", "Weller 40-Watt LED Soldering Iron", "Welding & Soldering", "Weller", null, null, "Available", 3, null, user2));
//			toolRepo.save(new Tool("Soldering Iron", "Weller 75-Watt Soldering Gun", "Welding & Soldering", "Weller", null, null, "Available", 3, null, user2));
//			toolRepo.save(new Tool("Torch Head", "Bernzomatic TS$000T Trigger Start Torch Head", "Welding & Soldering", "Bernzomatic", null, null, "Available", 3, null, user2));
//			toolRepo.save(new Tool("Circular Saw", "Makita 15 Amp 7-1/4 in. Corded Circular Saw", "Power Tool", "Makita", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Reciprocating Saw", "Milwaukee 15 Amp Super Reciprocating Saw", "Power Tool", "Milwaukee", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Drill/Driver", "Dewalt 20-Volt Lithium Cordless Drill-Driver", "Power Tool", "Brand1", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Hammer Drill", "Bosh 13.5 Amp Corded 1-78 in. Rotary Hammer Drill", "Power Tool", "Bosh", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Spray Gun", "Husky Gravity Feed HVLP Spray Gun", "Power Tool", "Husky", null, null, "Available", 1, null, user2));		
//			toolRepo.save(new Tool("Mechanics Tool Set", "Mechanics Tool Set (108-Piece)", "Hand Tool", "Dewalt", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Wood Chisel", "Economy Wood Chisel Set(3-Piece)", "Hand Tool", "Buck Bros.", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Adjustable Wrench", "Husky Double-Speed Adjustable Wrench Set (3-Piece)", "Hand Tool", "Husky", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Stubby Set", "Husky Stubby Set With Extendable Ratchet(46-Piece)", "Hand Tool", "Husky", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Screwdriver", "Screwdriver Set (6-Piece)", "Hand Tool", "Husky", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("SAE Ratcheting Wrench", "SAE Ratcheting Combination Wrench Set(10-Piece)", "Hand Tool", "SAE", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Tongue Plier", "Channellock 12in. Tongue and Grove Pliers", "Hand Tool", "Channellock", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Cutting Plier", "Husky 7 in. Diagonal Cutting Pliers", "Hand Tool", "Husky", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Hammer", "Estwing 20 oz. Straight-Claw Rip Hammer", "Hand Tool", "Estwing", null, null, "Available", 1, null, user2));		
//			toolRepo.save(new Tool("Floor Jack", "Husky 3-Ton Low Profile Floor Jack With Speedy Lift", "Automotive Tool", "Husky", null, null, "Available", 2, null, user2));
//			toolRepo.save(new Tool("Rolling Seat", "Wen 250 lb.Capacity Rolling Mechanic Seat With Onboard Storage", "Automotive Tool", "WEN", null, null, "Available", 2, null, user2));
//			toolRepo.save(new Tool("Steel Jack", "Big Red 6-Ton Double Lock Steel Jack", "Automotive Tool", "Big Red", null, null, "Available", 2, null, user2));
//			toolRepo.save(new Tool("Scissor Jack", "Big Red 1.5-Ton Scissor Jack", "Automotive Tool", "Big Red", null, null, "Available", 2, null, user2));
//			toolRepo.save(new Tool("Jum Starter", "Dewalt 1400 Peak Amp Starter with Digital Compressor", "Automotive Tool", "Dewalt", null, null, "Available", 2, null, user2));
//			toolRepo.save(new Tool("Jumper Calbles", "Formey 12 Ft Heavy Duty Battery Jumper Cables", "Automotive Tool", "Formey", null, null, "Available", 2, null, user2));
//			toolRepo.save(new Tool("123456789012345678901234567890", "12345678901234567890123456789012345678901234567890123456789012345678901234567890", "123456789012345678901234567890", "123456789012345678901234567890", null, null, "123456789012345678901234567890", 1, null, user2));
//			toolRepo.save(new Tool("Circular Saw", "Makita 15 Amp 7-1/4 in. Corded Circular Saw", "Power Tool", "Makita", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Reciprocating Saw", "Milwaukee 15 Amp Super Reciprocating Saw", "Power Tool", "Milwaukee", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Drill/Driver", "Dewalt 20-Volt Lithium Cordless Drill-Driver", "Power Tool", "Brand1", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Hammer Drill", "Bosh 13.5 Amp Corded 1-78 in. Rotary Hammer Drill", "Power Tool", "Bosh", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Spray Gun", "Husky Gravity Feed HVLP Spray Gun", "Power Tool", "Husky", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Mechanics Tool Set", "Mechanics Tool Set (108-Piece)", "Hand Tool", "Dewalt", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Wood Chisel", "Economy Wood Chisel Set(3-Piece)", "Hand Tool", "Buck Bros.", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Adjustable Wrench", "Husky Double-Speed Adjustable Wrench Set (3-Piece)", "Hand Tool", "Husky", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Stubby Set", "Husky Stubby Set With Extendable Ratchet(46-Piece)", "Hand Tool", "Husky", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Screwdriver", "Screwdriver Set (6-Piece)", "Hand Tool", "Husky", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("SAE Ratcheting Wrench", "SAE Ratcheting Combination Wrench Set(10-Piece)", "Hand Tool", "SAE", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Tongue Plier", "Channellock 12in. Tongue and Grove Pliers", "Hand Tool", "Channellock", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Cutting Plier", "Husky 7 in. Diagonal Cutting Pliers", "Hand Tool", "Husky", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Hammer", "Estwing 20 oz. Straight-Claw Rip Hammer", "Hand Tool", "Estwing", null, null, "Available", 1, null, user2));
//			toolRepo.save(new Tool("Floor Jack", "Husky 3-Ton Low Profile Floor Jack With Speedy Lift", "Automotive Tool", "Husky", null, null, "Available", 2, null, user2));
//			toolRepo.save(new Tool("Rolling Seat", "Wen 250 lb.Capacity Rolling Mechanic Seat With Onboard Storage", "Automotive Tool", "WEN", null, null, "Available", 2, null, user2));
//			toolRepo.save(new Tool("Steel Jack", "Big Red 6-Ton Double Lock Steel Jack", "Automotive Tool", "Big Red", null, null, "Available", 2, null, user2));
//			toolRepo.save(new Tool("Scissor Jack", "Big Red 1.5-Ton Scissor Jack", "Automotive Tool", "Big Red", null, null, "Available", 2, null, user2));
//			toolRepo.save(new Tool("Jum Starter", "Dewalt 1400 Peak Amp Starter with Digital Compressor", "Automotive Tool", "Dewalt", null, null, "Available", 2, null, user2));
//			toolRepo.save(new Tool("Jumper Calbles", "Formey 12 Ft Heavy Duty Battery Jumper Cables", "Automotive Tool", "Formey", null, null, "Available", 2, null, user2));
//		
//			toolRepo.save(new Tool("Welder", "Lincoln Electric 180 Amp Weld-Pak MIG Wire Feed Welder", "Welding & Soldering", "Lincoln Electric", null, null, "Available", 3, null, user2));
//			toolRepo.save(new Tool("Soldering Iron", "Weller 40-Watt LED Soldering Iron", "Welding & Soldering", "Weller", null, null, "Available", 3, null, user2));
//			toolRepo.save(new Tool("Soldering Iron", "Weller 75-Watt Soldering Gun", "Welding & Soldering", "Weller", null, null, "Available", 3, null, user1));
//			toolRepo.save(new Tool("Torch Head", "Bernzomatic TS$000T Trigger Start Torch Head", "Welding & Soldering", "Bernzomatic", null, null, "Available", 3, null ,user1));
//			
//			toolRepo.save(new Tool("Lantern", "Eveready Readyflex Floating Lantern", "Safety & Security", "Eveready", null, null, "Available", 4, null, user1));
//			toolRepo.save(new Tool("Flashlight", "Coast HP7 Focusing LED Flashlight", "Safety & Security", "Coast", null, null, "Available", 4, null, user1));
//
//			toolRepo.save(new Tool("Heated Jacket", "Dewalt Unisex Large High Visibility Yellow 20-Volt Heated Jacket", "Gear & Equipment", "Dewalt", null, null, "Available", 5, null, user2));
//			toolRepo.save(new Tool("PVC Boots", "Mat Size 11 PVC Black Boots", "Gear & Equipment", "Mat", null, null, "Available", 5, null, user1));

		}
	}
