package com.hrcalling;
/*import java.util.*;
public class HiringProcess {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("HR:Hello! ");
		System.out.println("Enter your Name:");
		String candidateName=sc.nextLine();
		System.out.println("Am I speaking with "+candidateName);
		System.out.println("Candidate: ");
		String rpl=sc.next();
		System.out.println("HR: Hi "+candidateName+"! I'm Priya from ABC Technologies. We received your resume through Naukri. Is this a good time to talk?");
		System.out.println("Candidate:");
		String reply=sc.next();
		if(reply.equalsIgnoreCase("yes")) {
			System.out.println("ma'am. I'm available.");
			System.out.println("HR: Great! Thank you for your time. Let's discuss your profile.");
			System.out.println("HR: May I know your academic percentages? Please tell me your 10th, Intermediate and Graduation percentages or CGPA.");
			System.out.println("Candidate: ");
			System.out.println("My 10th percentage:");
			double tenth=sc.nextDouble();
			System.out.println("My inter percentage:");
			double inter=sc.nextDouble();
			System.out.println("My graduation percentage:");
			double graduation=sc.nextDouble();
			if(tenth>=70 && inter>=60 && graduation>=60) {
				System.out.println("HR: Excellent! Your academic performance meets our requirements. Let's move forward.");
				System.out.println("HR: May I know your graduation branch? ");
				System.out.println("Candidate:  ");
				String branch =sc.next();
				if(branch.equalsIgnoreCase("CSE") || branch.equalsIgnoreCase("ECE")) {
					System.out.println("HR: That's great! Your branch is accepted for this position.");
				}else {
					System.out.println("HR: Okay, no problem. We may also have openings suitable for your branch. We will consider your profile for those opportunities.");
				}
				System.out.println("HR: Tell me about your major technical skill.");
				System.out.println("Candidate:");
				String skills=sc.next();
				if(skills.equalsIgnoreCase("JAVA")||skills.equalsIgnoreCase("python")||skills.equalsIgnoreCase("sql")) {
					System.out.println(" HR: That's good! let's continue ..");
					System.out.println("HR: Do you have any previous work experience?");
					System.out.println("Candidate:");
					String ans=sc.next();
					if(ans.equalsIgnoreCase("yes")) {
						System.out.println("HR: That's great! Which company did you work for?");
						System.out.println("Candidate:I worked at");
						String cname=sc.next();
						System.out.println("HR: Nice! ");
					}else {
						System.out.println("ma'am. I'm a fresher.");
						System.out.println("HR: That's absolutely fine! We also have opportunities for freshers.");
					}
					System.out.println("HR: Have you worked on any academic or personal projects?");
					System.out.println("Candidate:");
					String anss=sc.next();
					if(anss.equalsIgnoreCase("yes")) {
						System.out.println("I completed an academic project.");
						System.out.println("HR: Great! Can you briefly explain your project?");
						System.out.println("Candidate:My Project name is:");
						String projectDetails=sc.nextLine();
						System.out.println("HR:That's interesting! ");
					}else {
						System.out.println("ma'am. I haven't worked on any personal projects.");
						System.out.println("HR: That's alright. We encourage candidates to gain practical experience through projects.");
					}
					System.out.println("HR: Are you willing to relocate to Hyderabad?");
					System.out.println("Candidate:");
					String rpy=sc.next();
					if(rpy.equalsIgnoreCase("yes")) {
						System.out.println("ma'am. I'm comfortable relocating.");
						System.out.println("HR: Great! Our office is located in Hyderabad.");
						System.out.println("HR: What are your salary expectations?");
						System.out.println("Candidate:");
						double sal=sc.nextDouble();
						if(sal<500000) {
							System.out.println(" HR: That's good! Your expectations are within our budget.");
							System.out.println("HR: If selected, how soon can you join?");
							System.out.println("Candidate:");
							boolean b=sc.nextBoolean();
							if(b) {
								System.out.println("I can join immediately.");
								System.out.println(" HR: Excellent! That's a plus point.");
								System.out.println("HR: Great! Thank you for sharing all your details. Based on your academic background, technical skills and other information, your profile matches our current job requirements.");
								System.out.println("Candidate: Thank you, ma'am.");
								System.out.println("HR: We would like to move forward with your profile for the next round of the selection process.");
								System.out.println("Candidate: Sure, ma'am. Thank you for considering my profile.");
								System.out.println(" HR: We will share the next-round details and interview schedule through your registered email address. Please check your email.");
								System.out.println("Candidate: Okay, ma'am. I will check my email. ");
							}
							else {
								System.out.println("HR: That's perfectly fine. We can't consider your joining availability.Sorry! for that ");
							}
						}else {
							System.out.println("HR: I understand your expectations. Unfortunately, we may not be able to match them for this position. Thank you for your time.");
						}
					}else {
						System.out.println("ma'am.I'm unable to relocate.");
						System.out.println(" HR: I understand your situation. Unfortunately, relocation is mandatory for this position. Thank you for your time.");
					}
					
				}else {
					System.out.println("Sorry ! we don't have openings for this skill.see you soon..");
				}
			
			}else {
				System.out.println("HR: I'm sorry. Our company requires a minimum of 70% in 10th and 60% in Intermediate and Graduation. Unfortunately, you don't meet the eligibility criteria for this position. ");
			}
			
		}else {
			System.out.println("Candidate:Sorry, ma'am. I'm busy right now.");
			System.out.println(" No problem. I'll contact you later. Thank you!");
		}
		

	}*/

//package com.hrcalling;

import java.util.*;

public class HiringProcess {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("HR:Hello! ");
		System.out.println("Enter your Name:");
		String candidateName=sc.nextLine();

		System.out.println("Am I speaking with "+candidateName+"?");
		System.out.println("Candidate:");
		String rpl=sc.nextLine();

		System.out.println("HR: Hi "+candidateName+"! I'm Priya from ABC Technologies. We received your resume through Naukri. Is this a good time to talk?");
		System.out.println("Candidate:");
		String reply=sc.nextLine();

		if(reply.equalsIgnoreCase("yes")) {

			System.out.println("Candidate: Ma'am. I'm available.");
			System.out.println("HR: Great! Thank you for your time. Let's discuss your profile.");
			System.out.println("HR: May I know your academic percentages? Please tell me your 10th, Intermediate and Graduation percentages or CGPA.");
			System.out.println("Candidate: ");

			System.out.println("My 10th percentage:");
			double tenth=sc.nextDouble();

			System.out.println("My inter percentage:");
			double inter=sc.nextDouble();

			System.out.println("My graduation percentage:");
			double graduation=sc.nextDouble();
			sc.nextLine();

			if(tenth>=70 && inter>=60 && graduation>=60) {

				System.out.println("HR: Excellent! Your academic performance meets our requirements. Let's move forward.");
				System.out.println("HR: May I know your graduation branch? ");
				System.out.println("Candidate:  ");

				String branch=sc.nextLine();

				if(branch.equalsIgnoreCase("CSE") || branch.equalsIgnoreCase("ECE")) {

					System.out.println("HR: That's great! Your branch is accepted for this position.");

				}else {

					System.out.println("HR: Okay, no problem. We may also have openings suitable for your branch. We will consider your profile for those opportunities.");

				}

				System.out.println("HR: Tell me about your major technical skill.");
				System.out.println("Candidate:");

				String skills=sc.nextLine();

				if(skills.equalsIgnoreCase("JAVA") || skills.equalsIgnoreCase("python") || skills.equalsIgnoreCase("sql")) {

					System.out.println("HR: That's good! let's continue ..");
					System.out.println("HR: Do you have any previous work experience?");
					System.out.println("Candidate:");

					String ans=sc.nextLine();

					if(ans.equalsIgnoreCase("yes")) {

						System.out.println("HR: That's great! Which company did you work for?");
						System.out.println("Candidate:I worked at");

						String cname=sc.nextLine();
						
						System.out.println("HR: Nice! "+cname);

					}else {

						System.out.println("Candidate: Ma'am. I'm a fresher.");
						System.out.println("HR: That's absolutely fine! We also have opportunities for freshers.");

					}

					System.out.println("HR: Have you worked on any academic or personal projects?");
					System.out.println("Candidate:");

					String anss=sc.nextLine();

					if(anss.equalsIgnoreCase("yes")) {

						System.out.println("I completed an academic project.");
						System.out.println("HR: Great! Can you briefly explain your project?");
						System.out.println("Candidate: My Project details are:");

						String projectDetails=sc.nextLine();

						System.out.println("HR: That's interesting! "+projectDetails);

					}else {

						System.out.println("Candidate: Ma'am. I haven't worked on any personal projects.");
						System.out.println("HR: That's alright. We encourage candidates to gain practical experience through projects.");

					}

					System.out.println("HR: Are you willing to relocate to Hyderabad?");
					System.out.println("Candidate:");

					String rpy=sc.nextLine();

					if(rpy.equalsIgnoreCase("yes")) {

						System.out.println(" Ma'am. I'm comfortable relocating.");
						System.out.println("HR: Great! Our office is located in Hyderabad.");
						System.out.println("HR: What are your salary expectations?");
						System.out.println("Candidate:");

						double sal=sc.nextDouble();

						if(sal<500000) {

							System.out.println("HR: That's good! Your expectations are within our budget.");
							System.out.println("HR: Can you join immediately? (true/false)");
							System.out.println("Candidate:");

							boolean b=sc.nextBoolean();

							if(b) {

								System.out.println("Candidate: I can join immediately.");
								System.out.println("HR: Excellent! That's a plus point.");
								System.out.println("HR: Great! Thank you for sharing all your details. Based on your academic background, technical skills and other information, your profile matches our current job requirements.");
								System.out.println("Candidate: Thank you, ma'am.");
								System.out.println("HR: We would like to move forward with your profile for the next round of the selection process.");
								System.out.println("Candidate: Sure, ma'am. Thank you for considering my profile.");
								System.out.println("HR: We will share the next-round details and interview schedule through your registered email address. Please check your email.");
								System.out.println("Candidate: Okay, ma'am. I will check my email.");

							}else {

								System.out.println("HR: That's perfectly fine. We can't consider your joining availability. Sorry for that.");

							}

						}else {

							System.out.println("HR: I understand your expectations. Unfortunately, we may not be able to match them for this position. Thank you for your time.");

						}

					}else {

						System.out.println("Candidate: Ma'am. I'm unable to relocate.");
						System.out.println("HR: I understand your situation. Unfortunately, relocation is mandatory for this position. Thank you for your time.");

					}

				}else {

					System.out.println("Sorry! We don't have openings for this skill. See you soon..");

				}

			}else {

				System.out.println("HR: I'm sorry. Our company requires a minimum of 70% in 10th and 60% in Intermediate and Graduation. Unfortunately, you don't meet the eligibility criteria for this position.");

			}

		}else {

			System.out.println("Candidate: Sorry, ma'am. I'm busy right now.");
			System.out.println("HR: No problem. I'll contact you later. Thank you!");

		}

	}

}



