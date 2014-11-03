package hacker.rank.challenges.misc.regex.detectemail;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void testProblemStatementSample() {

    final String input = "19\n"
            + "HackerRank is more than just a company\n"
            + "    We are a tight group of hackers, bootstrappers, entrepreneurial thinkers and innovators. We are building an engaged community of problem solvers. Imagine the intelligence and value that a room would hold if it contained hackers/problem solvers from around the world? We're building this online.\n"
            + "Hypothesis: Every hacker loves a particular type of challenge presented in a certain set of difficulty. If we build a large collection of real world challenges in different domains with an engaging interface, it is going to be incredible! Join us to create history.\n"
            + "Available Positions\n"
            + "Product Hacker product@hackerrank.com\n"
            + "Challenge Curator\n"
            + "Product Evangelist\n"
            + "Product Designer\n"
            + "Content Creator\n"
            + "ACM World Finals Hacker\n"
            + "Backend C++ Hacker\n"
            + "Mail us at hackers@hackerrank.com to chat more. Or you can write to us at interviewstreet@hackerrank.com!\n"
            + "HACKERRANK PERKS\n"
            + "Working for a startup is hard work, but there are plenty of benefits of working for a small, fun, growing team.\n"
            + "[Image] Perk: Get tools for the jobAll the Right ToolsWe know that everyone's perfect workspace is unique to them. We will get you set up with whatever equipment you need to start hacking - a new 15” Macbook Pro or iMac, or a computer of your choice plus a display if you need it. Additionally, if you require any software or other tools, we've got it covered.[Image] Perk: Flexible HoursFlexible HoursBecause we work so hard, we encourage our employees to keep flexible hours and don't require them to track their time. A morning scrum and open communication ensures that the job gets done on time, and we rely on the honor system so that you can work on your own pace.[Image] Perk: HealthcareWellness SupportTo work hard, you have to be healthy. We will cover your health, dental, and visual insurance with no wait period. That means instant benefits from the day you're hired.[Image] Perk: Choice of LocationLocation, Location, LocationWe are the first Indian company to be backed by Y-Combinator, and as a result we have a thriving office in Bangalore and a growing office in Mountain View, CA. Depending on your residency or visa status, we will get you situated in one of our two offices, both of which are located in the heart of their country's tech industry.[Image] Perk: Choice of LocationCreative SupportIf you have a cool side project that you want to launch, we will pay for EC2/heroku servers to get it off the ground. Side projects fuel creativity and learning, which are crucial to the HackerRank culture.\n"
            + "CULTURE\n"
            + "The culture of a startup is reflective of the founders’ DNA. Larry Page & Sergey Brin were PhD’s from Stanford and that’s why Google is filled with high scoring graders from top schools and is very hard to get in if you’re not a CS major. Similarly, the hacker culture at Facebook is inspired by Zuckerberg, a hacker, the design culture by Steve Jobs and so on.\n"
            + "The adjective to describe the environment/founders here is relentless hardworkers. It might be a general trait of a startup but I’m pretty sure it’s a notch higher here and defines the culture. This is what has taken us this far. It’s not working in weekends or allnighters that count, but the effort that goes into building something intellectually engaging for hackers and making it fun is high.\n"
            + "You’ll have to embrace randomness and chaos. There’s some level of discipline (eg: daily scrums) but only so much. We push boundaries everyday, stretch our limits but no one complains because there’s a feeling of doing something great at the end of the day, every single day.";

    final String expected = "hackers@hackerrank.com;interviewstreet@hackerrank.com;product@hackerrank.com";
    final String actual = new Solution.DetectEmails().solve(new Scanner(input));

    System.out.println("E: " + expected + "\nA: " + actual);
    assertEquals(expected, actual);
  }

  @Test
  public void testSample0() {

    final String input = "36\n"
            + "Finally this phone is testimony to our quest and ever open ears for hearing from our customers since 1921. We look forward to hearing from you today.\n"
            + "All India National Toll Free Number: 180 0425 0426\n"
            + "Working Hours: 10:00 am to 6:00 pm (Monday ~ Friday),\n"
            + "10:00 am to 2:00 pm (Saturday). To report ATM Card Lost, Kindly contact: +91 (44) 2622 3106 / 2622 3109.\n"
            + "TMB Customer Care: +91 9842 461 461\n"
            + "For all your queries, on any of our services in any branch in India, you can now SMS ï¿½ï¿½ï¿½helpï¿½ï¿½ï¿½ or call +91 9842 461 461. TMBï¿½ï¿½ï¿½s Customer Care team is at your service (10:00am to 5:30pm) & will address your concerns immediately. You can also email us at: customerservice@tnmbonline.com\n"
            + "NRI Help Desk:\n"
            + "Non Resident Indians / Persons of Indian Origin can write to us for priority response to this separate email id for any queries, questions and banking solutions. Email: nricell@tnmbonline.com\n"
            + "TMB Head Office Static Map (Click for Live Map)\n"
            + "Head Office:\n"
            + "Static Location Map (Pointer A) and the contact address of our Registered and Administrative Office:\n"
            + "Tamilnad Mercantile Bank Limited\n"
            + "(A Scheduled Commercial Bank & Authorized Dealers in Foreign Exchange)\n"
            + "57, V.E. Road, Tuticorin, Tamilnadu, India. Zip: 628 002.\n"
            + "Phone: +91 (461) 232 1382 / 232 1929 / 232 1932.\n"
            + "Email: bd@tnmbonline.com\n"
            + "Email: ttn_tmbankhi@sancharnet.in\n"
            + "Global Network of Branch / ATMï¿½ï¿½ï¿½s / Points of Presence:\n"
            + "Click the Branch Network to find out more about the current branches / atms / pop network anwhere in India.\n"
            + "TMB IBD Office Static Map (Click for Live Map)\n"
            + "International Banking Division (IBD / Forex):\n"
            + "Static Location Map of Chennai (Gopalpuram Area - Pointer A) and the complete contact address of our international banking division which takes care of all the overseas and forex activities:\n"
            + "Tamilnad Mercantile Bank Limited\n"
            + "269/2-4, Avvai Shanmugham Road, Royapettah,\n"
            + "Chennai, Tamilnadu, India. Zip: 600 014.\n"
            + "Phone: +91 (44) 2813 1028 / 2813 1029.\n"
            + "Email: ibd@tnmbonline.com\n"
            + "Other Non Banking Administrative Offices:\n"
            + "Click the Non Banking Administrative Offices Network to find out more about the other offices / departments of TMB.\n"
            + "- See more at: http://www.tmb.in/contact_us/our_contact_info_email_and_postal_mail_address.html#sthash.u7R69pmj.dpuf\n"
            + "whymandesign 3 Nov\n"
            + "Can we help eg @WEBiversity @davos: @Delhi listens to @citizens #India @learn #transparency #gov? http://wef.ch/m1ZAW  #WEF @NextBillion\n"
            + "Followed by edutopia\n"
            + "Expand\n"
            + " Trustlibrary.org ï¿½ï¿½ï¿½@TRUSTlibrary 3 Nov\n"
            + "Can we help eg @WEBiversity @davos: @Delhi listens to @citizens #India @learn #transparency #gov? http://wef.ch/m1ZAW  #WEF @NextBillion";

    final String expected = "bd@tnmbonline.com;customerservice@tnmbonline.com;ibd@tnmbonline.com;nricell@tnmbonline.com;ttn_tmbankhi@sancharnet.in";
    final String actual = new Solution.DetectEmails().solve(new Scanner(input));

    System.out.println("E: " + expected + "\nA: " + actual);

    assertEquals(expected, actual);
  }

  @Test
  public void testSample1() {

    final String input = "71\n"
            + "Adventure\n"
            + "Send a letter to the editor about the content of the Adventure website.\n"
            + "mpotts@ngs.org\n"
            + "Advertising\n"
            + "Why not sponsor an online feature?\n"
            + "jbmccorm@ngs.org\n"
            + "The Complete National Geographic\n"
            + "Use this help form to contact us with comments or support questions regarding The Complete National Geographic on DVD or hard drive.\n"
            + "CNG Help Form\n"
            + "Customer Service: Magazine Subscriptions\n"
            + "Send questions regarding your subscriptions. Check on delivery, expiration dates, or other concerns. Inquiries about National Geographic, National Geographic Kids, and Traveler can be sent to this email address. Customer service is also available online at ngsline@customersvc.com.\n"
            + "Digital Magazine Subscriptions\n"
            + "For questions about digital subscriptions to National Geographic magazine (iPad, Nook, Kindle, or Zinio) email us at ngsdigital@customersvc.com or call 1-800-895-2068. You can also read the digital FAQs online.\n"
            + "Donating to National Geographic\n"
            + "Please contact us at givinginfo@ngs.org or call +1 202 862 8638 with any questions regarding your donation, or how to make a donation in support of the Society's work in exploration, research, and education. Thank you for your support!\n"
            + "Frequently Asked Questions\n"
            + "Find answers to your questions here.\n"
            + "http://www.nationalgeographic.com/faq/\n"
            + "Games\n"
            + "For questions about downloadable games and Plan It Green Live, please write to:\n"
            + "askngs@nationalgeographic.com and put \"Attn: Games\" in the subject line.\n"
            + "Genographic Project\n"
            + "Send us your questions regarding the Genographic Project.\n"
            + "genographic@ngs.org\n"
            + "Genographic Project en espaï¿½ï¿½ol\n"
            + "Envienos en espaï¿½ï¿½ol sus preguntas sobre el Proyecto Genographic.\n"
            + "genographicespanol@ngs.org\n"
            + "Mobile Applications and More\n"
            + "Email us with comments or support questions regarding our content for iPhone, iPad, Android, Windows Mobile 7, and more: apps@ngs.org.\n"
            + "For magazine app and digital subscription queries email us at ngsdigital@customersvc.com or call 1-800-895-2068.\n"
            + "National Geographic Channel\n"
            + "Send comments or questions regarding our television programming.\n"
            + "feedback@natgeotv.com\n"
            + "National Geographic Expeditions\n"
            + "For more information or to reserve your space, call toll-free 1-888-966-8687, or reserve online at nationalgeographicexpeditions.com.\n"
            + "For email inquiries use this form.\n"
            + "National Geographic Magazine\n"
            + "Send a letter to the Editor about the content of National Geographic magazine. Letters will be considered for the monthly Forum column.\n"
            + "ngsforum@nationalgeographic.com\n"
            + "National Geographic Maps\n"
            + "Contact us with questions about our maps.\n"
            + "maps@ngs.org\n"
            + "Photography: Stock Photography\n"
            + "National Geographic Stock's photography collection offers the best in rights managed and royalty free wildlife, travel, landscape and lifestyle photographs available for professional editorial and commercial licensing.\n"
            + "stock@ngs.org\n"
            + "Photography: Commercial Assignments\n"
            + "National Geographic Assignment represents international commercial photographers specializing in lifestyle, adventure, travel, and landscape photography. Online portfolios are available.\n"
            + "ngassignment@ngs.org\n"
            + "Photography: Prints\n"
            + "You can order beautiful National Geographic prints for your home or as a great gift. Browse through our collection.\n"
            + "News\n"
            + "Send comments, questions or concerns regarding the National Geographic News site.\n"
            + "newsdesk@nationalgeographic.com\n"
            + "Public Relations\n"
            + "Send press inquiries here.\n"
            + "pressroom@ngs.org\n"
            + "Speakers Bureau\n"
            + "Send inquiries about having a National Geographic photographer, adventurer, explorer, or scientist speak at your next event.\n"
            + "speakers@ngs.org\n"
            + "TOPO! Digital Maps\n"
            + "Send us your product and technical support quesions.\n"
            + "topo@ngs.org\n"
            + "Traveler Magazine\n"
            + "Send a letter about Traveler magazine.\n"
            + "Traveler@ngs.org\n"
            + "Your Shot & Your Shot Puzzles\n"
            + "Help Form\n"
            + "Frequently Asked Questions\n"
            + "Miscellaneous\n"
            + "Not sure where to send your question? Weï¿½ï¿½ï¿½ll pass it to the proper department. Please keep in mind that the high volume of mail does not allow us to send everyone a personal answer.\n"
            + "askngs@nationalgeographic.com";

    final String expected = "Traveler@ngs.org;apps@ngs.org;askngs@nationalgeographic.com;feedback@natgeotv.com;genographic@ngs.org;genographicespanol@ngs.org;givinginfo@ngs.org;jbmccorm@ngs.org;maps@ngs.org;mpotts@ngs.org;newsdesk@nationalgeographic.com;ngassignment@ngs.org;ngsdigital@customersvc.com;ngsforum@nationalgeographic.com;ngsline@customersvc.com;pressroom@ngs.org;speakers@ngs.org;stock@ngs.org;topo@ngs.org";
    final String actual = new Solution.DetectEmails().solve(new Scanner(input));

    System.out.println("E: " + expected + "\nA: " + actual);
    assertEquals(expected, actual);
  }

  @Test
  public void testSample2() {
    final String input = "51\n"
            + "E-MAIL ADDRESSES OF GMs AND DRMs ON IR\n"
            + "RLY	GM E-Mail	Division	DRM E-Mail\n"
            + "CR	gm@cr.railnet.gov.in	Mumbai	drm@bb.railnet.gov.in\n"
            + "Bhusawal	drm@bsl.railnet.gov.in\n"
            + "Pune	drm@pa.railnet.gov.in\n"
            + "Nagpur	drm@ngp.railnet.gov.in\n"
            + "Solapur	drm@sur.railnet.gov.in\n"
            + "ER 	gm@er.railnet.gov.in	Howrah	drmhwh@er.railnet.gov.in\n"
            + "Sealdah	drmsdah@er.railnet.gov.in\n"
            + "Asansol	drmasn@er.railnet.gov.in\n"
            + "Malda	drmmldt@er.railnet.gov.in\n"
            + "ECR 	gm@ecr.railnet.gov.in	Danapur	drmdnr@ecr.railnet.gov.in\n"
            + "Dhanbad	drmdhn@ecr.railnet.gov.in\n"
            + "Mughalsarai	drmmgs@ecr.railnet.gov.in\n"
            + "Samastipur	drmspj@ecr.railnet.gov.in\n"
            + "Sonpur	drmsee@ecr.railnet.gov.in\n"
            + "ECoR    	gm@eastcoastrailway.gov.in  	Khurda Road	drmkur@eastcoastrailway.gov.in\n"
            + "Sambalpur	drmsbp@eastcoastrailway.gov.in\n"
            + "Waltair	drmwat@eastcoastrailway.gov.in\n"
            + "NR 	gm@nr.railnet.gov.in	Delhi	drm@dli.railnet.gov.in\n"
            + "Ambala	drm@umb.railnet.gov.in\n"
            + "Moradabad	drm@mb.railnet.gov.in\n"
            + "Lucknow	drm@lko.railnet.gov.in\n"
            + "Ferozepur	drm@fzr.railnet.gov.in\n"
            + "NCR    	gm@ncr.railnet.gov.in  	Allahabad	drm@ald.railnet.gov.in\n"
            + "Jhansi	drm@jhs.railnet.gov.in\n"
            + "Agra	drm@agc.railnet.gov.in\n"
            + "NER	gm@ner.railnet.gov.in	Izzatnagar	drmizn@ner.railnet.gov.in\n"
            + "Lucknow	drmljn@ner.railnet.gov.in\n"
            + "Varanasi	drmbsb@ner.railnet.gov.in\n"
            + "NFR	gm@nfr.railnet.gov.in	Katihar	drmkir@nfr.railnet.gov.in\n"
            + "Alipurduar	drmapdj@nfr.railnet.gov.in\n"
            + "Tinsukhia	drmtsk@nfr.railnet.gov.in\n"
            + "Lumding	drmlmg@nfr.railnet.gov.in\n"
            + "Rangia	drmrny@nfr.railnet.gov.in\n"
            + "NWR	gm@nwr.railnet.gov.in	Jaipur	drmjp@nwr.railnet.gov.in\n"
            + "Ajmer	drmaii@nwr.railnet.gov.in\n"
            + "Bikaner	drmbkn@nwr.railnet.gov.in\n"
            + "Jodhpur	drmju@nwr.railnet.gov.in\n"
            + "SR	gm@sr.railnet.gov.in	Chennai	drmmas@sr.railnet.gov.in\n"
            + "Madurai	drmmdu@sr.railnet.gov.in\n"
            + "Salem	drmsa@sr.railnet.gov.in\n"
            + "Palghat	drmpgt@sr.railnet.gov.in\n"
            + "Tiruchirapalli	drmtpj@sr.railnet.gov.in\n"
            + "Trivandrum	drmtvc@sr.railnet.gov.in\n"
            + "SCR	gm@scr.railnet.gov.in	Secundrabad	drmsc@scr.railnet.gov.in\n"
            + "Hyderabad	drmshyb@scr.railnet.gov.in\n"
            + "Guntkal	drmgtl@scr.railnet.gov.in\n"
            + "Guntur	drmgnt@scr.railnet.gov.in\n"
            + "Nanded	drmned@scr.railnet.gov.in\n"
            + "Vijayawada	drmbza@scr.railnet.gov.in";

    final String actual = new Solution.DetectEmails().solve(new Scanner(input));
    final String expected = "drm@agc.railnet.gov.in;drm@ald.railnet.gov.in;drm@bb.railnet.gov.in;drm@bsl.railnet.gov.in;drm@dli.railnet.gov.in;drm@fzr.railnet.gov.in;drm@jhs.railnet.gov.in;drm@lko.railnet.gov.in;drm@mb.railnet.gov.in;drm@ngp.railnet.gov.in;drm@pa.railnet.gov.in;drm@sur.railnet.gov.in;drm@umb.railnet.gov.in;drmaii@nwr.railnet.gov.in;drmapdj@nfr.railnet.gov.in;drmasn@er.railnet.gov.in;drmbkn@nwr.railnet.gov.in;drmbsb@ner.railnet.gov.in;drmbza@scr.railnet.gov.in;drmdhn@ecr.railnet.gov.in;drmdnr@ecr.railnet.gov.in;drmgnt@scr.railnet.gov.in;drmgtl@scr.railnet.gov.in;drmhwh@er.railnet.gov.in;drmizn@ner.railnet.gov.in;drmjp@nwr.railnet.gov.in;drmju@nwr.railnet.gov.in;drmkir@nfr.railnet.gov.in;drmkur@eastcoastrailway.gov.in;drmljn@ner.railnet.gov.in;drmlmg@nfr.railnet.gov.in;drmmas@sr.railnet.gov.in;drmmdu@sr.railnet.gov.in;drmmgs@ecr.railnet.gov.in;drmmldt@er.railnet.gov.in;drmned@scr.railnet.gov.in;drmpgt@sr.railnet.gov.in;drmrny@nfr.railnet.gov.in;drmsa@sr.railnet.gov.in;drmsbp@eastcoastrailway.gov.in;drmsc@scr.railnet.gov.in;drmsdah@er.railnet.gov.in;drmsee@ecr.railnet.gov.in;drmshyb@scr.railnet.gov.in;drmspj@ecr.railnet.gov.in;drmtpj@sr.railnet.gov.in;drmtsk@nfr.railnet.gov.in;drmtvc@sr.railnet.gov.in;drmwat@eastcoastrailway.gov.in;gm@cr.railnet.gov.in;gm@eastcoastrailway.gov.in;gm@ecr.railnet.gov.in;gm@er.railnet.gov.in;gm@ncr.railnet.gov.in;gm@ner.railnet.gov.in;gm@nfr.railnet.gov.in;gm@nr.railnet.gov.in;gm@nwr.railnet.gov.in;gm@scr.railnet.gov.in;gm@sr.railnet.gov.in";

    System.out.println("E: " + expected + "\nA: " + actual);
    assertEquals(expected, actual);
  }

  @Test
  public void testSample3() {
    final String input = "14\n"
            + "Letters to the Editor (Your complete mailing address is required):\n"
            + "letters@thehindu.co.in\n"
            + "Readers' Editor:\n"
            + "readerseditor@thehindu.co.in\n"
            + "Advertisements Queries (Print):\n"
            + "inetads@thehindu.co.in\n"
            + "Advertisements Queries (Online):\n"
            + "digital@thehindu.co.in\n"
            + "Advertisements Queries (International):\n"
            + "international@thehindu.co.in\n"
            + "Subscription Queries:\n"
            + "subs@thehindu.co.in\n"
            + "Comments on the website:\n"
            + "web.thehindu@thehindu.co.in";
    final String actual = new Solution.DetectEmails().solve(new Scanner(input));
    final String expected = "digital@thehindu.co.in;inetads@thehindu.co.in;international@thehindu.co.in;letters@thehindu.co.in;readerseditor@thehindu.co.in;subs@thehindu.co.in;web.thehindu@thehindu.co.in";

    System.out.println("E: " + expected + "\nA: " + actual);
    assertEquals(expected, actual);
  }
}
