package com.nelioalves.cursomc.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class S3Config {
/*
	@Value("${aws.acess_key_id}")
	private String awsId;

	@Value("${aws.acess_access_key}")
	private String awsKey;

	@Value("${s3.bucket}")
	private String region;

	@Bean
	public AmazonS3 s3client() {
		BasicAWSCredentials awsCred = new BasicAWSCredentials(awsId, awsKey);
		AmazonS3 s3client = AmazonS3ClientBuilder.standard().withRegion(Regions.fromName(region))
				.withCredentials(new AWSStaticCredentialsProvider(awsCred)).build();
		return s3client;
	}
*/
}
