SOURCE_DIR = src/com/abantohq/weddingplanner
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
	$(JAVA) $(PACKAGE).WeddingPlanner

test:
	$(JAVA) $(PACKAGE).WeddingPlannerTest

.PHONY: all build clean compile generate package run test
