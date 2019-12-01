package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author GAJDA NORBERT
 */
public class DbModel {

    Connection conn;

    private PreparedStatement authLoginPstmt;
    
    private PreparedStatement getAllEmployeesPstmt;
    private PreparedStatement addEmployeePstmt;
    private PreparedStatement deleteEmployeePstmt;
    
    private PreparedStatement getAllMembersPstmt;
    private PreparedStatement addMemberPstmt;
    private PreparedStatement updateMemberPstmt;
    private PreparedStatement deleteMemberPstmt;

    private PreparedStatement getAllGamesPstmt;
    private PreparedStatement addGamePstmt;
    private PreparedStatement updateGamePstmt;
    private PreparedStatement deleteGamePstmt;

    public DbModel(Connection conn) throws SQLException {
        this.conn = conn;

        authLoginPstmt = conn.prepareStatement("SELECT * FROM employees WHERE username=? AND password=?");
        
        getAllEmployeesPstmt = conn.prepareStatement("SELECT * FROM employees ORDER BY name ASC");
        addEmployeePstmt = conn.prepareStatement("INSERT INTO employees (name,username,password) VALUES (?,?,?)");
        deleteEmployeePstmt = conn.prepareStatement("DELETE FROM employees WHERE id=?");
        
        getAllMembersPstmt = conn.prepareStatement("SELECT * FROM members WHERE id>? ORDER BY name ASC");
        addMemberPstmt = conn.prepareStatement ("INSERT INTO members (name,email, phone) VALUES (?,?,?)");
        updateMemberPstmt = conn.prepareStatement("UPDATE members SET name=?, email=?, phone=?");
        deleteMemberPstmt = conn.prepareStatement("DELETE FROM members WHERE id=?");
        
        getAllGamesPstmt = conn.prepareStatement("SELECT * FROM games ORDER BY name ASC");

      }

    
    public Employee authLogin (String user, String pass) throws SQLException{
        authLoginPstmt.setString(1, user);
        authLoginPstmt.setString(2, pass);
        
        Employee employee = null;
        ResultSet rs = authLoginPstmt.executeQuery();
        while (rs.next()){
            employee = new Employee(rs.getString("name"), rs.getString("username"), rs.getString("password"));
        }
        return employee;
    }
        
    public List<Employee> getAllEmployees() throws SQLException {
        List<Employee> employees = new ArrayList<>();
        ResultSet rs = getAllEmployeesPstmt.executeQuery();

        while (rs.next()) {
            employees.add(new Employee(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("username"),
                    rs.getString("password")
            ));
        }
        rs.close();
        return employees;
    }

    public Map<String, String> getMapEmployees() throws SQLException {
        List<Employee> employees = getAllEmployees();
        Map<String, String> employeesMap = new HashMap<>();

        for (Employee employee : employees) {
            employeesMap.put(employee.getUserName(), employee.getPassword());
        }
        return employeesMap;
    }
    
    public int addEmployee(Employee employee) throws SQLException {
        addEmployeePstmt.setString(1, employee.getName());
        addEmployeePstmt.setString(2, employee.getUserName());
        addEmployeePstmt.setString(3, employee.getPassword());
        
        return addEmployeePstmt.executeUpdate();
    }
    
    public int deleteEmployee(Employee employee) throws SQLException {
        deleteEmployeePstmt.setInt(1, employee.getId());
        
        return deleteEmployeePstmt.executeUpdate();
    }
    
    
    public List<Member> getAllMembers() throws SQLException {
        List<Member> members = new ArrayList<>();
        getAllMembersPstmt.setInt(1, 0);
        ResultSet rs = getAllMembersPstmt.executeQuery();
        
        while (rs.next()) {
            members.add(new Member(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("phone")
            ));
        }
        return members;
    }
    
    public int addMember (Member member) throws SQLException{
        addMemberPstmt.setString(1, member.getName());
        addMemberPstmt.setString(2, member.getEmail());
        addMemberPstmt.setString(3, member.getPhone());
        
        return addMemberPstmt.executeUpdate();
    }
    
    public int deleteMember(Member member) throws SQLException {
        deleteMemberPstmt.setInt(1, member.getId());
        
        return deleteMemberPstmt.executeUpdate();
    }
    
        
    public List<Game> getAllVideoGames() throws SQLException{
        List<Game> games = new ArrayList<>();
        ResultSet rs = getAllGamesPstmt.executeQuery();
        
        while (rs.next()) {
            games.add(new Game(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("genre"),
                    rs.getString("platform"),
                    rs.getInt("members_id"),
                    rs.getString("rental_date")
            ));
        }
        rs.close();
        return games;
    }
    
    public Map<Integer, String> getMapMembers() throws SQLException{
        List<Member> Members = getAllMembers();
        Map<Integer, String> mapMembers = new HashMap<>();
        
        for (Member member : Members) {
            mapMembers.put(member.getId(), member.getName());
        }
        return mapMembers;
    }
    
    
    
    public void close() throws SQLException {
        conn.close();
    }
}
