import './UsersTable.module.css';

const data = [
	{ id: 1, first: "John", last: "Anom", email: "john.anom@email.com", project: "CC", position: "agent", password: "pswd", active: "true" },
	{ id: 2, first: "Jane", last: "Megha", email: "jane.megha@email.com", project: "CC", position: "agent", password: "psw", active: "false" },
	{ id: 3, first: "Rick", last: "Subham", email: "rick.subham@email.com", project: "CC", position: "QA", password: "pw", active: "true" },
];

function UsersTable() {
	return (
		<div>
			<table>
				<tr>
					<th>Id</th>
					<th>First Name</th>
					<th>Last Name</th>
                    <th>Email Address</th>
                    <th>Project</th>
                    <th>Position</th>
                    <th>Password</th>
                    <th>Status</th>
				</tr>
				{data.map((val, key) => {
					return (
						<tr key={key}>
							<td>{val.id}</td>
							<td>{val.first}</td>
							<td>{val.last}</td>
                            <td>{val.email}</td>
                            <td>{val.project}</td>
                            <td>{val.position}</td>
                            <td>{val.password}</td>
                            <td>{val.active}</td>
						</tr>
					);
				})}
			</table>
		</div>
	);
}

export default UsersTable;
