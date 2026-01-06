Vinayak_Project_Report

Project Title: IoT-Based Smart Energy Monitoring and Analytics System
Prepared by: Vinayak Rathi

Executive Summary

This report details my six-week industrial internship conducted under Upskill Campus and The IoT Academy, in collaboration with UniConverge Technologies Pvt Ltd (UCT).

The internship focused on a real-world project to design an IoT-based energy monitoring system. The project simulates real-time voltage and current data, calculates power and energy consumption using Java, and demonstrates industrial monitoring concepts.

This experience helped me gain exposure to industry workflows, IoT architecture, and software-based implementations for industrial problems.

1. Preface

During this internship, I worked on a project addressing the need for real-time energy monitoring in industries.

The program allowed me to design, implement, and test a simulated IoT-based energy monitoring system using Java.

I gained hands-on experience in system design, data processing, and industrial problem-solving.

I am grateful to Upskill Campus, The IoT Academy, and UCT mentors for their guidance.

I encourage juniors to participate in similar internships for practical exposure.

2. Introduction
2.1 About UniConverge Technologies Pvt Ltd (UCT)

Established in 2013, UCT specializes in digital transformation solutions with a focus on industrial IoT, sustainability, and ROI.

UCT leverages technologies like IoT, cloud computing (AWS, Azure), machine learning, cybersecurity, Java, Python, and front-end frameworks to deliver industrial solutions.

Key Platforms:

UCT IoT Platform: Connects devices using MQTT, CoAP, HTTP, OPC UA; supports dashboards, analytics, alert notifications, and third-party integration.

Smart Factory Platform: Provides production monitoring, predictive maintenance, OEE analytics, and digital twin solutions.

Predictive Maintenance Solutions: Monitors industrial machine health using IoT and ML, predicting remaining useful life.

2.2 About Upskill Campus (USC)

USC is a career development platform providing industry-aligned internships and executive coaching, facilitating the smooth execution of industrial projects.

2.3 About The IoT Academy

The IoT Academy, an EdTech division of UCT, runs certification programs in collaboration with IITs, focusing on IoT, AI, and industrial technologies.

2.4 Objectives of the Internship

Gain practical experience in solving real industrial problems.

Understand and implement IoT-based solutions.

Improve technical, analytical, and problem-solving skills.

Enhance communication and documentation skills.

2.5 References

IoT Concepts and Industry Applications – UniConverge Documentation

Java Programming and Simulation Tutorials

Upskill Campus Internship Guidelines

2.6 Glossary
Term	Acronym
Internet of Things	IoT
UniConverge Technologies Pvt Ltd	UCT
Upskill Campus	USC
Predictive Maintenance	PM
3. Problem Statement

Industries often lack real-time energy monitoring, leading to inefficient energy usage and higher operational costs.

The challenge was to design a system that could simulate real-time energy monitoring, calculate power and energy consumption, and demonstrate industrial IoT workflow using software.

4. Existing and Proposed Solution
Existing Solutions

Manual energy meter readings.

No real-time monitoring.

Lack of analytics for energy optimization.

Proposed Solution

Simulated IoT system using Java.

Voltage and current values generated in real-time.

Calculates power and energy consumption continuously.

Demonstrates cloud/application layer processing and dashboard-like output.

Code Submission (GitHub Link)
https://github.com/VinayakRathi/upSkillCampus

5. Proposed Design / Model
5.1 High-Level Diagram
Sensor → Controller → Cloud → Dashboard

5.2 Low-Level Design

Simulate voltage/current sensor readings.

Calculate power: Power = Voltage × Current.

Calculate energy: Energy = Power / 1000 (kWh).

Display results continuously in console (dashboard simulation).

5.3 Interfaces

Java console output simulates dashboard.

No physical hardware used.

Optional future integration with cloud dashboards.

6. Performance Test
6.1 Test Plan / Test Cases

Continuous data generation.

Correctness of power and energy calculation.

Real-time console display verification.

6.2 Test Procedure

Run Java program for several minutes.

Verify generated values within realistic ranges.

Observe continuous updates in console.

6.3 Performance Outcome

Energy and power values calculated correctly.

Continuous, real-time output observed.

System simulation reflects industrial workflow effectively.

7. My Learnings

Understood industrial IoT architecture.

Practiced Java programming for real-world simulation.

Learned how energy monitoring systems are structured.

Improved documentation, reporting, and presentation skills.

8. Future Work Scope

Integrate real IoT sensors for live data.

Connect system to cloud platforms (AWS, Azure).

Add dashboard visualization with analytics and notifications.

