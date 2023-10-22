SOURCE_DIR = src/main/java/com/abantohq/weddingplanner
SOURCE_TEST_DIR = src/test/java/com/abantohq/weddingplanner
PACKAGE = com.abantohq.weddingplanner

JAVAC = javac
JAVA = java
MVN = mvn

all: compile run

build:
	$(MVN) clean package

clean:
	find $(SOURCE_DIR) -name "*.class" -delete

compile:
	$(JAVAC) $(SOURCE_DIR)/*.java
	$(JAVAC) $(SOURCE_DIR)/*/*.java

generate:
	$(MVN) archetype:generate

package:
	$(MVN) compile test package

run:
	$(JAVA) $(SOURCE_DIR)/budget/Budget.java
	$(JAVA) $(SOURCE_DIR)/budget/BudgetDetail.java
	$(JAVA) $(SOURCE_DIR)/communications/Announcement.java
	$(JAVA) $(SOURCE_DIR)/communications/Channel.java
	$(JAVA) $(SOURCE_DIR)/communications/ChannelType.java
	$(JAVA) $(SOURCE_DIR)/contributions/Amount.java
	$(JAVA) $(SOURCE_DIR)/contributions/Contribution.java
	$(JAVA) $(SOURCE_DIR)/contributions/ContributionDetail.java
	$(JAVA) $(SOURCE_DIR)/giftregistry/Gift.java
	$(JAVA) $(SOURCE_DIR)/guestlist/Guest.java
	$(JAVA) $(SOURCE_DIR)/invitations/Code.java
	$(JAVA) $(SOURCE_DIR)/invitations/Invitation.java
	$(JAVA) $(SOURCE_DIR)/invitations/InvitationImage.java
	$(JAVA) $(SOURCE_DIR)/invitations/Usage.java
	$(JAVA) $(SOURCE_DIR)/savings/Installment.java
	$(JAVA) $(SOURCE_DIR)/savings/Saving.java
	$(JAVA) $(SOURCE_DIR)/savings/SavingDetail.java
	$(JAVA) $(SOURCE_DIR)/timeline/Milestone.java
	$(JAVA) $(SOURCE_DIR)/timeline/Timeline.java
	$(JAVA) $(SOURCE_DIR)/usermanagement/Wed.java
	$(JAVA) $(SOURCE_DIR)/usermanagement/WedRole.java
	$(JAVA) $(SOURCE_DIR)/vendors/Vendor.java
	$(JAVA) $(SOURCE_DIR)/vendors/VendorInvoice.java
	$(JAVA) $(SOURCE_DIR)/vendors/VendorPayment.java
	$(JAVA) $(SOURCE_DIR)/vendors/VendorPaymentDetail.java

test:
	$(JAVA) $(SOURCE_TEST_DIR)/budget/BudgetTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/budget/BudgetDetailTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/communications/AnnouncementTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/communications/ChannelTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/communications/ChannelTypeTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/contributions/AmountTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/contributions/ContributionTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/contributions/ContributionDetailTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/giftregistry/GiftTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/guestlist/GuestTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/invitations/CodeTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/invitations/InvitationTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/invitations/InvitationImageTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/invitations/UsageTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/savings/InstallmentTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/savings/SavingTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/savings/SavingDetailTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/timeline/MilestoneTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/timeline/TimelineTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/usermanagement/WedTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/usermanagement/WedRoleTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/vendors/VendorTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/vendors/VendorInvoiceTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/vendors/VendorPaymentTest.java
	$(JAVA) $(SOURCE_TEST_DIR)/vendors/VendorPaymentDetailTest.java

.PHONY: all build clean compile generate package run test
