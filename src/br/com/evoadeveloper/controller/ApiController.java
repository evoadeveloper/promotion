package br.com.evoadeveloper.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;

import br.com.evoadeveloper.conection.Connection;
import br.com.evoadeveloper.conection.IConnection;
import br.com.evoadeveloper.model.Company;
import br.com.evoadeveloper.model.Promotion;
import br.com.evoadeveloper.model.SystemMessage;
import br.com.evoadeveloper.model.User;

@Path("v1")
public class ApiController {

	private IConnection connection = new Connection();
	private User user = new User();
	private Promotion promotion = new Promotion();
	private Company company = new Company();
	private ObjectMapper ObjectMapper = new ObjectMapper();
	private SystemMessage systemMessage = new SystemMessage();

	@Path("/user/add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addUser(JSONObject pjJsonObject) {
		try {
			user = ObjectMapper.readValue(pjJsonObject.toString(), User.class);
			connection.add(user);
			return Response.status(200).entity(systemMessage.build(SystemMessage.SUCCESS)).build();
		} catch (Exception e) {
			return Response.status(500).entity(systemMessage.build(SystemMessage.ERROR)).build();
		}
	}

	@Path("/user/update")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateUser(JSONObject pjJsonObject) {
		try {
			user = ObjectMapper.readValue(pjJsonObject.toString(), User.class);
			connection.update(user);
			return Response.status(200).entity(systemMessage.build(SystemMessage.SUCCESS)).build();
		} catch (Exception e) {
			return Response.status(500).entity(systemMessage.build(SystemMessage.ERROR)).build();
		}
	}

	@Path("/user/delete")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteUser(JSONObject pjJsonObject) {
		try {
			user = ObjectMapper.readValue(pjJsonObject.toString(), User.class);
			connection.delete(user);
			return Response.status(200).entity(systemMessage.build(SystemMessage.SUCCESS)).build();
		} catch (Exception e) {
			return Response.status(500).entity(systemMessage.build(SystemMessage.ERROR)).build();
		}
	}

	@Path("/user/find")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response findUser(JSONObject pjJsonObject) {
		try {
			user = ObjectMapper.readValue(pjJsonObject.toString(), User.class);
			return Response.status(200).entity(connection.find(user, "email")).build();
		} catch (Exception e) {
			return Response.status(500).entity(systemMessage.build(SystemMessage.ERROR)).build();
		}
	}

	@Path("/user/list")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response listUsers(JSONObject pjJsonObject) {
		try {
			user = ObjectMapper.readValue(pjJsonObject.toString(), User.class);
			return Response.status(200).entity(connection.list(user)).build();
		} catch (Exception e) {
			return Response.status(500).entity(systemMessage.build(SystemMessage.ERROR)).build();
		}
	}

	@Path("/company/add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addCompany(JSONObject pjJsonObject) {
		try {
			company = ObjectMapper.readValue(pjJsonObject.toString(), Company.class);
			connection.add(company);
			return Response.status(200).entity(systemMessage.build(SystemMessage.SUCCESS)).build();
		} catch (Exception e) {
			return Response.status(500).entity(systemMessage.build(SystemMessage.ERROR)).build();
		}
	}

	@Path("/company/update")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateCompany(JSONObject pjJsonObject) {
		try {
			company = ObjectMapper.readValue(pjJsonObject.toString(), Company.class);
			connection.update(company);
			return Response.status(200).entity(systemMessage.build(SystemMessage.SUCCESS)).build();
		} catch (Exception e) {
			return Response.status(500).entity(systemMessage.build(SystemMessage.ERROR)).build();
		}
	}

	@Path("/company/delete")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteCompany(JSONObject pjJsonObject) {
		try {
			company = ObjectMapper.readValue(pjJsonObject.toString(), Company.class);
			connection.delete(company);
			return Response.status(200).entity(systemMessage.build(SystemMessage.SUCCESS)).build();
		} catch (Exception e) {
			return Response.status(500).entity(systemMessage.build(SystemMessage.ERROR)).build();
		}
	}

	@Path("/company/find")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response findCompany(JSONObject pjJsonObject) {
		try {
			company = ObjectMapper.readValue(pjJsonObject.toString(), Company.class);
			return Response.status(200).entity(connection.find(company, "email")).build();
		} catch (Exception e) {
			return Response.status(500).entity(systemMessage.build(SystemMessage.ERROR)).build();
		}
	}

	@Path("/company/list")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response listCompany(JSONObject pjJsonObject) {
		try {
			company = ObjectMapper.readValue(pjJsonObject.toString(), Company.class);
			return Response.status(200).entity(connection.list(company)).build();
		} catch (Exception e) {
			return Response.status(500).entity(systemMessage.build(SystemMessage.ERROR)).build();
		}
	}

	@Path("/promotion/add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addPromotion(JSONObject pjJsonObject) {
		try {
			promotion = ObjectMapper.readValue(pjJsonObject.toString(), Promotion.class);
			connection.add(promotion);
			return Response.status(200).entity(systemMessage.build(SystemMessage.SUCCESS)).build();
		} catch (Exception e) {
			return Response.status(500).entity(systemMessage.build(SystemMessage.ERROR)).build();
		}
	}

	@Path("/promotion/update")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updatePromotion(JSONObject pjJsonObject) {
		try {
			promotion = ObjectMapper.readValue(pjJsonObject.toString(), Promotion.class);
			connection.update(promotion);
			return Response.status(200).entity(systemMessage.build(SystemMessage.SUCCESS)).build();
		} catch (Exception e) {
			return Response.status(500).entity(systemMessage.build(SystemMessage.ERROR)).build();
		}
	}

	@Path("/promotion/delete")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response deletePromotion(JSONObject pjJsonObject) {
		try {
			promotion = ObjectMapper.readValue(pjJsonObject.toString(), Promotion.class);
			connection.delete(promotion);
			return Response.status(200).entity(systemMessage.build(SystemMessage.SUCCESS)).build();
		} catch (Exception e) {
			return Response.status(500).entity(systemMessage.build(SystemMessage.ERROR)).build();
		}
	}

	@Path("/promotion/find")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response findPromotionByName(JSONObject pjJsonObject) {
		try {
			promotion = ObjectMapper.readValue(pjJsonObject.toString(), Promotion.class);
			return Response.status(200).entity(connection.find(promotion, "name")).build();
		} catch (Exception e) {
			return Response.status(500).entity(systemMessage.build(SystemMessage.ERROR)).build();
		}
	}

	@Path("/promotion/list")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response listPromotion(JSONObject pjJsonObject) {
		try {
			promotion = ObjectMapper.readValue(pjJsonObject.toString(), Promotion.class);
			return Response.status(200).entity(connection.list(promotion)).build();
		} catch (Exception e) {
			return Response.status(500).entity(systemMessage.build(SystemMessage.ERROR)).build();
		}
	}

	@Path("/promotion/listallvalidpromotions")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response listAllValidPromotions(JSONObject pjJsonObject) {
		try {
			promotion = ObjectMapper.readValue(pjJsonObject.toString(), Promotion.class);
			return Response.status(200).entity(connection.listAllValidPromotions(promotion.getFinalDate())).build();
		} catch (Exception e) {
			return Response.status(500).entity(systemMessage.build(SystemMessage.ERROR)).build();
		}
	}

}
