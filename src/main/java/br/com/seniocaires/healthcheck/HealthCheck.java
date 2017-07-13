package br.com.seniocaires.healthcheck;

import static spark.Spark.get;

/**
 * @author Senio Caires
 */
public class HealthCheck {

	/**
	 * @author Senio Caires
	 */
	private static final String EMPTY = "{}";

	/**
	 * @author Senio Caires
	 * @param args
	 */
	public static void main(String[] args) {

		get("/health", (request, response) -> {
			response.status(200);
			response.type("application/json");
			return EMPTY;
		});

	}
}
