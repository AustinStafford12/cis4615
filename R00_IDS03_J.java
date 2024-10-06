// Rule 00. Input Validation and Data Sanitization (IDS)
// compliant code:
if (loginSuccessful) {
  logger.severe("User login succeeded for: " + sanitizaUser(username));
} else {
  logger.severe("User login failed for: " + sanitizaUser(username));
}
public String sanitizeUser(String username) {
  return Pattern.matches("[A-Za-z0-9_]+", username))
    ? username : "unauthorized user";
}
